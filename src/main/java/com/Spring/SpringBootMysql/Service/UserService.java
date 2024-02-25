package com.Spring.SpringBootMysql.Service;


import com.Spring.SpringBootMysql.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service()
public interface UserService {
    
    //TODO LIST
    Iterable<User> getAllUser();

    User createdUser(User user);
    
    void updatedUser(Long id, User updateUser);

    void deleteUser(Long id);
}
