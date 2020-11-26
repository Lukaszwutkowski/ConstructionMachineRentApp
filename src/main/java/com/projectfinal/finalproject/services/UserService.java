package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.User;
import com.projectfinal.finalproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }

    //Update User
    public void save(User user) {
        userRepository.save(user);
    }
}
