package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

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

    //GET
    @Override
    public Iterable<User_Permissions> getAllPermissions() {
       return userPermissionsRepo.findAll();
    }

    //POST
    @Override
    public User_Permissions createdUserPermissions(User_Permissions userPermissions) {
        return userPermissionsRepo.save(userPermissions);
    }

    //PUT
    @Override
    public void updateUserPermissions(Long id, User_Permissions updateUserPermissions) {
        Optional<User_Permissions> user_PermissionsToUpdateOptional = userPermissionsRepo.findById(id);

        if (user_PermissionsToUpdateOptional.isPresent()) {
            User_Permissions userPermissionsToUpdate = user_PermissionsToUpdateOptional.get();
            userPermissionsToUpdate.setId(updateUserPermissions.getId());
            userPermissionsToUpdate.setPermission_id(updateUserPermissions.getPermission_id());
            userPermissionsRepo.save(userPermissionsToUpdate);
        }
    }

    //DELETE
    @Override
    public void deleteUserPermissions(Long id) {
        Optional<User_Permissions> user_PermissionsToDeleteOptional = userPermissionsRepo.findById(id);
        
        if (user_PermissionsToDeleteOptional.isPresent()) {
            User_Permissions userPermissionsToDelete = user_PermissionsToDeleteOptional.get();
            userPermissionsRepo.delete(userPermissionsToDelete);
        }
    }
    
}
