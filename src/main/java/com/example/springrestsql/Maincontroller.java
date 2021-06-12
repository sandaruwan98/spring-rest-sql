package com.example.springrestsql;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Maincontroller {

    @GetMapping
    String hello(){
        return "hello spring";
    }

}
