package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dong
 * @date 2020/3/16 13:25
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {

        return Logger.Level.FULL;
    }
}
