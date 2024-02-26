package com.Spring.SpringBootMysql.controller;

import com.Spring.SpringBootMysql.Service.UserService;
import com.Spring.SpringBootMysql.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

        if (user == null) throw new NullPointerException();
        return userService.createdUser(user);
    }

    //PUT
    @PutMapping("/testput/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User updateUser) {

        if (updateUser == null) throw new NullPointerException();
        userService.updateUser(id, updateUser);
    }

    //DELETE
    @DeleteMapping("/testdelete")
    public void deleteUser(@RequestParam Long id) {
        userService.deleteUser(id);
    }
    
}

    