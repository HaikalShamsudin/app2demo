package com.Spring.SpringBootMysql.controller;

import com.Spring.SpringBootMysql.Service.UserService;
import com.Spring.SpringBootMysql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user") 
@Controller
public class UserController {
 
    @Autowired
    UserService userService;

    //GET
    @GetMapping("/testget")
    public Iterable<User> getAllUser() {
        return userService.getAllUser();
    }

    //POST
    @PostMapping("/testpost")
    public User createdUser(@RequestBody User user) {
        return userService.createdUser(user);
    }
}

    
