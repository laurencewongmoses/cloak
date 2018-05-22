package com.cloak.serivce.conf;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @param
 * @Title:
 * @Author:wangpeng
 * @Description: TODO(这里用一句话描述这个方法的作用)
 * @return
 * @throws
 */
@Configuration
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfig {
	@Getter @Setter private String host;
	@Getter @Setter private String password;
	@Getter @Setter private int port;
	@Getter @Setter private int poolmaxactive;//最大活跃数
	@Getter @Setter private int poolmaxwait;//最大等待数
	@Getter @Setter private int poolmaxidle;//最大空闲
	@Getter @Setter private int poolminidle;//最小空闲
	@Getter @Setter private int timeout;//超时

	@Bean
	public JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(poolmaxactive);
		poolConfig.setMaxIdle(poolmaxidle);
		poolConfig.setMinIdle(poolminidle);
		poolConfig.setMaxWaitMillis(poolmaxwait);
		return poolConfig;
	}

	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		factory.setPoolConfig(jedisPoolConfig());
		factory.setHostName(host);
		factory.setPassword(password);
		factory.setPort(port);
		factory.setTimeout(timeout);
		return factory;
	}

	@Bean
	public <T> RedisTemplate<String, T> redisTemplate() {
		RedisTemplate<String, T> template = new RedisTemplate<>();
		// 从jedisConnectionFactory获取Jedis实例
		template.setConnectionFactory(jedisConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		// 序列化与反序列化
		template.setValueSerializer(new RedisObjectSerializer());
		return template;
	}
}
