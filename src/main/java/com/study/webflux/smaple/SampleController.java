package com.study.webflux.smaple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author : JB
 * @packageName : com.study.webflux.smaple
 * @fileName : SampleController
 * @description :
 * @since : 2023-10-13
 */
@RestController
public class SampleController {

    @GetMapping(value="/")
    public Mono<String> index() {
        return Mono.just("Hello Spring webflux");
    }
}
