package com.example.santanderdevweek2023.service;

import com.example.santanderdevweek2023.model.User;
import com.example.santanderdevweek2023.repository.UserRepository;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
