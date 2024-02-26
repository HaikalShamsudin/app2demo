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

import com.Spring.SpringBootMysql.Service.PermissionsService;
import com.Spring.SpringBootMysql.model.Permissions;


@RestController
@RequestMapping("/")
@Controller
public class PermissionsController {
    
    @Autowired
    PermissionsService permissionsService;

    //GET
    @GetMapping("/getpermissions")
    public Iterable<Permissions> getPermissions() {
        return permissionsService.getPermission();

    }

    //POST
    @PostMapping("/postpermissions")
    public Permissions createdPermissions(@RequestBody Permissions permissions) {
        return permissionsService.createdPermissions(permissions);
    }
     //PUT
    @PutMapping("/putpermissions")
    public void updatePermissions(@PathVariable Long id, @RequestBody Permissions permissions) {

        if (permissions == null) throw new NullPointerException();
        permissionsService.updatePermissions(id, permissions);    
    }

    //DELETE
     @DeleteMapping("/deletepermissions")
    public void deleteUserPermissions(@RequestParam Long id) {
        permissionsService.deletePermissions(id);
    }

}
