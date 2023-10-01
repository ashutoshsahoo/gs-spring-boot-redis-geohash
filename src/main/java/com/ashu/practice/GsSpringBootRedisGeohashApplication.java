package com.ashu.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.GeoOperations;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class GsSpringBootRedisGeohashApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsSpringBootRedisGeohashApplication.class, args);
    }


    @Bean
    public GeoOperations<String, String> geoOperations(RedisTemplate<String, String> template) {
        return template.opsForGeo();
    }

}
