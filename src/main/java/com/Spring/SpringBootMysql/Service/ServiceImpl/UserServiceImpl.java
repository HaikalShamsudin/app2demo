package com.Spring.SpringBootMysql.Service.ServiceImpl;

import com.Spring.SpringBootMysql.Service.UserService;
import com.Spring.SpringBootMysql.model.User;
import com.Spring.SpringBootMysql.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepo userRepo;

    @Override
    public Iterable<User> getAllUser() {
       return userRepo.findAll();
    }

    @Override
    public User createdUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void updatedUser(Long id, User updateUser) {
        return userRepo.
    }

    @Override
    public void deleteUser(Long id) {
    
    }

    

}
