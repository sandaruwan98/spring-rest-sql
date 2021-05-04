package com.example.springrestsql.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "user")
public class UserController {

    @GetMapping
    public @ResponseBody String heloo(){
        return "hello";
    }

}
