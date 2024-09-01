package com.mevy.santander_dev_week_2023.services.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.mevy.santander_dev_week_2023.models.User;
import com.mevy.santander_dev_week_2023.repositories.UserRepository;
import com.mevy.santander_dev_week_2023.services.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(user);
    }
    
}
