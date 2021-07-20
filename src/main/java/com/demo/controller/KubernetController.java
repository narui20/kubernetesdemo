package com.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class KubernetController {

    @GetMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)

    public String hello(){
        return "This is working!!!";
    }
}
