package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class HelloService {
    public HashMap<String, Object> makeHello() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("condition", Boolean.TRUE);
        map.put("name", "tom");
        return map;
    }
}
