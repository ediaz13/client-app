package com.springboot.client.controller;

import com.springboot.client.models.Message;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class AppController {
    @GetMapping("/list")
    public List<Message> list() {
        return Arrays.asList(
                new Message("Hello, World!", "John"),
                new Message("Hi, there!", "Tom")
        );
    }

    @PostMapping("/create")
    public Message create(@RequestBody Message message) {
        System.out.println("Creating message: " + message.getText() + " from " + message.getUser());
        return message;
    }

    public Map<String, String> authorized(@RequestParam String code) {
        return Collections.singletonMap("code", code);
    }
}
