package com.cicd.spring.cicdspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCicdController {

    @GetMapping("/")
    public String getHello(){
        return "Hello CICD.. 😄";
    }
}
