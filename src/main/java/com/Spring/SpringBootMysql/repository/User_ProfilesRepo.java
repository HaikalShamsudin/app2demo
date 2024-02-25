package com.Spring.SpringBootMysql.repository;

import org.springframework.data.repository.CrudRepository;
import com.Spring.SpringBootMysql.model.User_Profiles;

public interface User_ProfilesRepo extends CrudRepository<User_Profiles, Long>{
    
}


//basically, this class was create to implements/to get the CridRepository method.