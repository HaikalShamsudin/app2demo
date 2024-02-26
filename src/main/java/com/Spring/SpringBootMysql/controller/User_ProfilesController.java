package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringBootMysql.Service.User_ProfilesService;
import com.Spring.SpringBootMysql.model.User_Profiles;


@RestController
@RequestMapping("/profiles")
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
    public User_Profiles createdUserProfiles(@RequestBody User_Profiles userProfiles) {

        if (userProfiles == null) throw new NullPointerException();
        return user_ProfilesService.createdUserProfiles(userProfiles);
    }

    //PUT
    @PutMapping("/testput")
    public void updateUserProfiles(@PathVariable Long id, @RequestBody User_Profiles updateUserProfiles) {

        if (updateUserProfiles == null) throw new NullPointerException();
        user_ProfilesService.updateUserProfiles(id, updateUserProfiles);    
    }

    //DELETE
    @DeleteMapping("/testdelete")
    public void deleteUserProfiles(@RequestParam Long id) {
        user_ProfilesService.deleteUserProfiles(id);
    }
}
