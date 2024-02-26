package com.Spring.SpringBootMysql.Service.ServiceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.SpringBootMysql.Service.User_ProfilesService;
import com.Spring.SpringBootMysql.model.User_Profiles;
import com.Spring.SpringBootMysql.repository.User_ProfilesRepo;

@Service
@Transactional
public class User_ProfilesServiceImpl implements User_ProfilesService {

    @Autowired
    private User_ProfilesRepo userProfilesRepo;


    //GET
    @Override
    public Iterable<User_Profiles> getAllUserProfiles() {
        return userProfilesRepo.findAll();
    }

    //POST
    @Override
    public User_Profiles createdUserProfiles(User_Profiles userProfiles) {
        return userProfilesRepo.save(userProfiles);
    }

    //PUT
    @Override
    public void updateUserProfiles(Long id, User_Profiles updateProfilesUser) {
        Optional<User_Profiles> user_ProfilesToUpdateOptional = userProfilesRepo.findById(id);

        if (user_ProfilesToUpdateOptional.isPresent()) {
            User_Profiles userProfilesToUpdate = user_ProfilesToUpdateOptional.get();
            userProfilesToUpdate.setId(updateProfilesUser.getId());
            userProfilesToUpdate.setFirst_name(updateProfilesUser.getFirst_name());
            userProfilesRepo.save(userProfilesToUpdate);
        }
    }

    //DELETE
    @Override
    public void deleteUserProfiles(Long id) {
        Optional<User_Profiles> user_ProfilesToDeleteOptional = userProfilesRepo.findById(id);

        if (user_ProfilesToDeleteOptional.isPresent()) {
            User_Profiles userProfilesToDelete = user_ProfilesToDeleteOptional.get();
            userProfilesRepo.delete(userProfilesToDelete);
        }
    }
    
}
