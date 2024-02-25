package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringBootMysql.Service.User_PermissionsService;
import com.Spring.SpringBootMysql.model.User_Permissions;

@RestController
@RequestMapping("/user")
@Controller
public class User_PermissionsController {

    @Autowired
    User_PermissionsService user_PermissionsService;

    @GetMapping ("/permissions")
    public Iterable <User_Permissions> getUserPermission(){
        return user_PermissionsService.getAllPermissions();
    }

    
}
