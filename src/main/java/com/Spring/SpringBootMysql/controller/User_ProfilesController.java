package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringBootMysql.Service.User_ProfilesService;
import com.Spring.SpringBootMysql.model.User;
import com.Spring.SpringBootMysql.model.User_Profiles;


@RestController
@RequestMapping("/user")
@Controller
public class User_ProfilesController {
    
    @Autowired
    User_ProfilesService user_ProfilesService;

    //GET
    @GetMapping("/testget")
    public Iterable<User_Profiles> getAllUserProfiles() {
        return user_ProfilesService.getAllUserProfiles();
    }

    //POST
    @PostMapping("/testpost")
    public User_Profiles createdUser(@RequestBody User_Profiles userProfiles) {
        return user_ProfilesService.createdUser(userProfiles);
    }
}
