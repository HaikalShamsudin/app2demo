package com.Spring.SpringBootMysql.Service;

import com.Spring.SpringBootMysql.model.User;
import com.Spring.SpringBootMysql.model.User_Profiles;

public interface User_ProfilesService {
    
    Iterable <User_Profiles> getAllUserProfiles();

    User_Profiles createdUser(User_Profiles userProfiles);
}
