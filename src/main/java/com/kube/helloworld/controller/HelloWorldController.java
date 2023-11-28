package com.kube.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public String bidHello(@PathVariable("name") String name) {
        return "Hello !! " + name + ", Welcome to the World of Kubernetes !!";
    }
    
}
