package com.cloak.serivce.conf;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author wangpeng
 * @ClassName: RedisBean
 * @Description: TODO
 * @date 2018年05月10日 上午11:31:37
 */
@Component
@Slf4j
public class RedisBean {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * @param @param key
     * @param @param value 设定文件
     * @return void 返回类型
     * @throws
     * @Title: setRedisValue
     * @Description: set
     */
    public void setRedisValue(String key, Object value, long timeout, TimeUnit unit)  {

        try {
            if (value.getClass().equals(String.class)){
                redisTemplate.opsForValue().set(key, value.toString());
            }else if (value.getClass().equals(Integer.class)){
                redisTemplate.opsForValue().set(key, value.toString());
            }else if (value.getClass().equals(Double.class)){
                redisTemplate.opsForValue().set(key, value.toString());
            }else if (value.getClass().equals(Float.class)){
                redisTemplate.opsForValue().set(key, value.toString());
            }else if (value.getClass().equals(Short.class)){
                redisTemplate.opsForValue().set(key, value.toString());
            }else if (value.getClass().equals(Long.class)){
                redisTemplate.opsForValue().set(key, value.toString());
            }else if (value.getClass().equals(Boolean.class)){
                redisTemplate.opsForValue().set(key, value.toString());
            }else{
                // 对象
                Gson gson = new Gson();
                String obj = gson.toJson(value);
                redisTemplate.opsForValue().set(key, obj);
            }
            redisTemplate.expire(key, timeout, unit);
            log.info("redis 存入: key=" + key + ", expire=" + redisTemplate.getExpire(key));
        }catch (Exception e)
        {
            log.info("redis 入值异常 "+e.getMessage());
        }

    }

    /**
     * @param @param  key
     * @param @return 设定文件
     * @return T 返回类型
     * @throws
     * @Title: get
     * @Description:获取缓存
     */
    private <T> T get(String key) throws Exception {
        log.info("redis 查询: key=" + key + ", expire=" + redisTemplate.getExpire(key));
        return (T) redisTemplate.opsForValue().get(key);
    }

    public Object getList(String key) throws Exception{
        Object json = get(key);
        if (null == json) return null;
        Gson gson = new Gson();
        String jsonStr = json.toString();
        List list = gson.fromJson(jsonStr, new TypeToken<List>() {}.getType());
        return list;
    }

    public Object getObject(String key){
        Object obj = null;
        try {
            obj = get(key);
        }catch (Exception e){
            log.info("Redis 获取值异常 "+e.getMessage());
        }

        if (null == obj) return null;
         else return obj;

    }

    public void deletePrefixKey(String prefix) throws Exception {
        Set<String> keys = redisTemplate.keys(prefix + "*");
        redisTemplate.delete(keys);
    }
}
