package com.demo.jpaauthdemo.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String defaultWelcomeMessage(){
        return "Hello, Welcome";
    }

    @GetMapping("/user")
    public String userWelcomeMessage(){
        return "Hello, User";
    }

    @GetMapping("/admin")
    public String adminWelcomeMessage(){
        return "Hello, Admin";
    }
}
