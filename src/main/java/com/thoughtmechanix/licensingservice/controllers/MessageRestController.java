package com.thoughtmechanix.licensingservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Antony Genil on 2019-06-29 at 06 20 for licensing-service
 **/

@RestController
@RequestMapping("/v1/messages")
@RefreshScope
public class MessageRestController {
    @Value("${tracer: Hello dummy message}")
    private String tracer;

    @RequestMapping("/tracer")
    String getTracer() {
        return this.tracer;
    }

}

