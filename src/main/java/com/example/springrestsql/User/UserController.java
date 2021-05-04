package com.example.springrestsql.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void registerUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
    }

    @PutMapping(path = "{id}")
    public void updateUser(@PathVariable Integer id,@RequestParam(required = false) String name,@RequestParam(required = false) String email ){
        userService.updateUser(id, name, email);
    }


}
