package com.example.santanderdevweek2023.service.impl;

import com.example.santanderdevweek2023.model.User;
import com.example.santanderdevweek2023.repository.UserRepository;
import com.example.santanderdevweek2023.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(userRepository.existsByAccountNumber(user.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account Number already exists");
        }
        return userRepository.save(user);
    }
}
