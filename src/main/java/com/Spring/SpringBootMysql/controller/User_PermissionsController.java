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

import com.Spring.SpringBootMysql.Service.User_PermissionsService;
import com.Spring.SpringBootMysql.model.User_Permissions;


@RestController
@RequestMapping("/permissions")
@Controller
public class User_PermissionsController {

    @Autowired
    User_PermissionsService user_PermissionsService;

    //GET
    @GetMapping ("/testget")
    public Iterable <User_Permissions> getUserPermission(){
        return user_PermissionsService.getAllPermissions();
    }

    //POST
    @PostMapping("/testpost")
    public User_Permissions createdUserPermissions(@RequestBody User_Permissions userPermissions) {
        return user_PermissionsService.createdUserPermissions(userPermissions);
    }
    
    //PUT
    @PutMapping("/testput")
    public void updateUserPermissions(@PathVariable Long id, @RequestBody User_Permissions updateUserPermissions) {

        if (updateUserPermissions == null) throw new NullPointerException();
        user_PermissionsService.updateUserPermissions(id, updateUserPermissions);    
    }

    //DELETE
     @DeleteMapping("/testdelete")
    public void deleteUserPermissions(@RequestParam Long id) {
        user_PermissionsService.deleteUserPermissions(id);
    }
}
