package com.dockerdemo.githubcicdactionsdocker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("hello")
    public String hello() {
        return "hello, docker is working properly";
    }
}
