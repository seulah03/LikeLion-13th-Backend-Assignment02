package com.likelion.springprac.Prac.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class PracController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring!";
    }
}
