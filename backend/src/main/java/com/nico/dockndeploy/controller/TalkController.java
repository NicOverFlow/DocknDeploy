package com.nico.dockndeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/talk")
public class TalkController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
