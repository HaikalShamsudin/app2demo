package com.Spring.SpringBootMysql.Service;


import com.Spring.SpringBootMysql.model.User;
import org.springframework.stereotype.Service;

@Service()
public interface UserService {
    
    //TODO LIST
    Iterable<User> getAllUser();

    User createdUser(User user);

    void updateUser(Long id, User updateUser);
    
    void deleteUser(Long id);
}
