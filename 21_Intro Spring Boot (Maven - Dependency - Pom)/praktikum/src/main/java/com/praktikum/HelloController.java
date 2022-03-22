package com.praktikum;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/v1/messages")
    public String hello(){
        return "Hello World Get";
    }

    @PostMapping("/v1/messages")
    public String hello2(){
        return "Hello World Post";
    }

    @DeleteMapping("/v1/messages")
    public String hello3(){
        return "Hello World Delete";
    }

}