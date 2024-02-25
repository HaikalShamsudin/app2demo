package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.User_Permissions;

public interface User_PermissionsService {
    
    Iterable<User_Permissions> getAllPermissions();
}
