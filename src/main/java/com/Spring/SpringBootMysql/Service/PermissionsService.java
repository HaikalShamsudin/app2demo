package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.Permissions;

public interface PermissionsService {

    Iterable <Permissions> getPermission();

    Permissions createdPermissions(Permissions permissions);

    void updatePermissions(Long id, Permissions updatePermissions);

    void deletePermissions(Long id);
}
