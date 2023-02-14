package com.example.demo.controllers;

import com.example.demo.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello", produces = "application/json")
    public Map<String, Object> hello() {
        HashMap<String, Object> map = helloService.makeHello();
        return map;
    }

    @PostMapping(value = "/hello", produces = "application/json")
    public ResponseEntity helloPost(@RequestParam Map params) {
        System.out.println("Hello!");
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
