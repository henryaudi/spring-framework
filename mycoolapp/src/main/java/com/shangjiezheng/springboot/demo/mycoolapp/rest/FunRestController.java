package com.shangjiezheng.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" endpoint that returns "Hello World".
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

}
