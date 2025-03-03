package com.example.dynasty_fantasy.services;

import com.example.dynasty_fantasy.models.User;
import com.example.dynasty_fantasy.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUserbyUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

