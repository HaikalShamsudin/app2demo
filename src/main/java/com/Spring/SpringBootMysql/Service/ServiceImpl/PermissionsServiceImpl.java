package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

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

    // GET
    @Override
    public Iterable<Permissions> getPermission() {
        return permissionsRepo.findAll();
    }

    // POST
    @Override
    public Permissions createdPermissions(Permissions permissions) {
        return permissionsRepo.save(permissions);
    }

    // PUT
    @Override
    public void updatePermissions(Long id, Permissions updatePermissions) {
        Optional<Permissions> permissionsToUpdateOptional = permissionsRepo.findById(id);

        if (permissionsToUpdateOptional.isPresent()) {
            Permissions permissionsToUpdate = permissionsToUpdateOptional.get();
            permissionsToUpdate.setId(updatePermissions.getId());
            permissionsToUpdate.setName(updatePermissions.getName());
            permissionsRepo.save(permissionsToUpdate);
        }
    }

    // DELETE
    @Override
    public void deletePermissions(Long id) {
        Optional<Permissions> permissionsToDeleteOptional = permissionsRepo.findById(id);

        if (permissionsToDeleteOptional.isPresent()) {
            Permissions permissionsToDelete = permissionsToDeleteOptional.get();
            permissionsRepo.delete(permissionsToDelete);
        }
    }
}
