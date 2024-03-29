package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.User_Profiles;

public interface User_ProfilesService {
    
    Iterable <User_Profiles> getAllUserProfiles();

    User_Profiles createdUserProfiles(User_Profiles userProfiles);

    void updateUserProfiles(Long id, User_Profiles updateProfilesUser);

    void deleteUserProfiles(Long id);
}
