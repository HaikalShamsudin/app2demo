package com.Spring.SpringBootMysql.Service.ServiceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.PermissionsService;
import com.Spring.SpringBootMysql.model.Permissions;
import com.Spring.SpringBootMysql.repository.PermissionsRepo;


@Service
@Transactional
public class PermissionsServiceImpl implements PermissionsService {

    @Autowired
    private PermissionsRepo permissionsRepo;

    @Override
    public Iterable<Permissions> getPermission() {
        return permissionsRepo.findAll();
    }
    
}
