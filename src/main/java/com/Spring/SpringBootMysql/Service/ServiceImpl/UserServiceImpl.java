package com.Spring.SpringBootMysql.Service.ServiceImpl;

import com.Spring.SpringBootMysql.Service.UserService;
import com.Spring.SpringBootMysql.model.User;
import com.Spring.SpringBootMysql.repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepo userRepo;

    //GET
    @Override
    public Iterable<User> getAllUser() {
       return userRepo.findAll();
    }

    //POST
    @Override
    public User createdUser(User user) {
        return userRepo.save(user);
    }

    //PUT
    @Override
    public void updateUser(Long id, User updateUser) {
        Optional<User> userToUpdateOptional = userRepo.findById(id);

        if (userToUpdateOptional.isPresent()) {
            User userToUpdate = userToUpdateOptional.get();
            userToUpdate.setUsername(updateUser.getUsername());
            userToUpdate.setEmail(updateUser.getEmail());
            userRepo.save(userToUpdate);
        }
    }

    //DELETE
    @Override
    public void deleteUser(Long id) {
        Optional<User> userToDeleteOptional = userRepo.findById(id);

        if (userToDeleteOptional.isPresent()) {
            User userToDelete = userToDeleteOptional.get();
            userRepo.delete(userToDelete);
        }
    }



}
