package com.springboot.client.controller;

import com.springboot.client.models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class AppController {
    @GetMapping("/hello")
    public List<Message> hello() {
        return Collections.singletonList(new Message("Hello, World Darling"));
    }

    @PostMapping("/create")
    public Message create(@RequestBody Message message) {
        System.out.println("Creating message: " + message);
        return message;
    }

    @GetMapping("/authorized")
    public Map<String, String> authorized(@RequestParam String code) {
        return Collections.singletonMap("code", code);
    }
}
