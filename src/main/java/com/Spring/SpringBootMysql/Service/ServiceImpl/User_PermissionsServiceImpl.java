package com.Spring.SpringBootMysql.Service.ServiceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.User_PermissionsService;
import com.Spring.SpringBootMysql.model.User_Permissions;
import com.Spring.SpringBootMysql.repository.User_PermissionsRepo;


@Service
@Transactional
public class User_PermissionsServiceImpl implements User_PermissionsService{

    @Autowired
    private User_PermissionsRepo userPermissionsRepo;

    @Override
    public Iterable<User_Permissions> getAllPermissions() {
       return userPermissionsRepo.findAll();
    }
    
}
