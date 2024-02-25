package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;
import com.Spring.SpringBootMysql.model.User_Permissions;

public interface User_PermissionsRepo extends CrudRepository <User_Permissions, Long> {
    
}
