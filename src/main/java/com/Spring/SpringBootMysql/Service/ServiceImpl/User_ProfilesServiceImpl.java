package com.Spring.SpringBootMysql.Service.ServiceImpl;

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


    
    @Override
    public Iterable<User_Profiles> getAllUserProfiles() {
        return userProfilesRepo.findAll();
    }

    @Override
    public User_Profiles createdUser(User_Profiles userProfiles) {
        return userProfilesRepo.save(userProfiles);
    }
    
}
