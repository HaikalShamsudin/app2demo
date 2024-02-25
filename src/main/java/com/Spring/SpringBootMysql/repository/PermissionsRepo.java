package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;
import com.Spring.SpringBootMysql.model.Permissions;

public interface PermissionsRepo extends CrudRepository <Permissions, Long> {
    
}
