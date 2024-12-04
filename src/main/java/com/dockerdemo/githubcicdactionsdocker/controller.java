package com.dockerdemo.githubcicdactionsdocker;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello, docker is working properly";
    }

    @GetMapping("/sayBye")
    public String bye() {
        return "bye";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Namaste";
    }

    @GetMapping("/name")
    public String name() {
        return "My name is Manjul Tamang";
    }

    @GetMapping("/age")
    public String age() {
        return "My age is 23 years";
    }
}
