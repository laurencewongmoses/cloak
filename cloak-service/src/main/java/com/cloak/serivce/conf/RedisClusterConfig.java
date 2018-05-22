//package com.cloak.serivce.conf;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import redis.clients.jedis.HostAndPort;
//import redis.clients.jedis.JedisCluster;
//import redis.clients.jedis.JedisPoolConfig;
//
//import java.util.LinkedHashSet;
//import java.util.Set;
//
///**
// * @param
// * @Title:
// * @Author:wangpeng
// * @Description: TODO(这里用一句话描述这个方法的作用)
// * @return
// * @throws
// */
//@Configuration
//@ConfigurationProperties(prefix = "redis-cluster")
//public class RedisClusterConfig {
//	@Getter
//    @Setter
//    private String hosts;
//	@Getter
//    @Setter
//    private Integer maxtotal;
//	@Getter
//    @Setter
//    private Integer maxidle;
//	@Getter
//    @Setter
//    private Integer maxwaitmillis;
//
//	@Bean
//	public JedisCluster jedisCluster()
//	{
//		JedisPoolConfig poolConfig = new JedisPoolConfig();
//		// 最大连接数
//		poolConfig.setMaxTotal(maxtotal);
//		// 最大空闲数
//		poolConfig.setMaxIdle(maxidle);
//		// 最大允许等待时间，如果超过这个时间还未获取到连接，则会报JedisException异常：
//		poolConfig.setMaxWaitMillis(maxwaitmillis);
//		Set<HostAndPort> nodes = new LinkedHashSet<>();
//		if(hosts!= null)
//			for(String str:hosts.split(","))
//				nodes.add(new HostAndPort(str.split(":")[0],Integer.parseInt(str.split(":")[1])));
//		return new JedisCluster(nodes, poolConfig);
//	}
//}
