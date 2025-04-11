package com.example.hexagonalexample.application.port.out;

import com.example.hexagonalexample.domain.User;

public interface LoadUserPort {
    User loadUser(String username, String password);
} 