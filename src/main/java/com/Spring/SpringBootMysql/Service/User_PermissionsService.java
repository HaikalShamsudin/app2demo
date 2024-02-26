package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.User_Permissions;

public interface User_PermissionsService {
    
    Iterable<User_Permissions> getAllPermissions();

    User_Permissions createdUserPermissions(User_Permissions userPermissions);

    void updateUserPermissions(Long id, User_Permissions updateUserPermissions);

    void deleteUserPermissions(Long id);
}
