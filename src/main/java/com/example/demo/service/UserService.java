package com.example.demo.service;

import com.example.demo.domain.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(String name, String email);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
} 