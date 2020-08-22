package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dong
 * @date 2020/8/22 15:34
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route",r->r.path("/guonei").uri("https://news.baidu.com/guonei"));

        return routes.build();
    }

    @Bean
    public RouteLocator routes1(RouteLocatorBuilder builder) {

        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route_guoji",r->r.path("/guoji").uri("https://news.baidu.com/guoji"));

        return routes.build();
    }
}
