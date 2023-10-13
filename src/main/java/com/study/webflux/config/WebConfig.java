package com.study.webflux.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author : JB
 * @packageName : com.study.webflux.config
 * @fileName : WebConfig
 * @description :
 * @since : 2023-10-13
 */
@Configuration
public class WebConfig {

    @Bean
    public RouterFunction<ServerResponse> router() {
        return RouterFunctions.route(RequestPredicates.GET("/route"),
                request -> ServerResponse.ok().body(BodyInserters.fromValue("Hello webflux route!"))
        );
    }
}
