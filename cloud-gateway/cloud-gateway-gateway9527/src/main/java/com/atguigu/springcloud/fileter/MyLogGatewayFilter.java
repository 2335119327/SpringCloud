package com.atguigu.springcloud.fileter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author dong
 * @date 2020/3/18 14:07
 */
//@Component
//@Slf4j
//public class MyLogGatewayFilter implements GlobalFilter, Ordered {
//
//    //过滤
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        log.info("********come in MyLogGatewayFilter: " + new Date());
//
//        //看有没有uname这个key
//        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
//        if (uname == null) {
//            log.info("*******用户名为null,非法用户,o(╥﹏╥)o");
//
//            //设置状态码 HttpStatus.NOT_ACCEPTABLE （不被接受）
//            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//            return exchange.getResponse().setComplete();
//        }
//        return chain.filter(exchange);
//    }
//
//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
