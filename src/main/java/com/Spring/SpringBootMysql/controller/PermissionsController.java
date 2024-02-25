package com.Spring.SpringBootMysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringBootMysql.Service.PermissionsService;
import com.Spring.SpringBootMysql.model.Permissions;

@RestController
@RequestMapping("/")
@Controller
public class PermissionsController {
    
    @Autowired
    PermissionsService permissionsService;

    @GetMapping("/permissions")
    public Iterable<Permissions> getPermissions() {
        return permissionsService.getPermission();

    }


}
