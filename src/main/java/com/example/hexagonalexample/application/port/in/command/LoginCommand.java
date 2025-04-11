package com.example.hexagonalexample.application.port.in.command;

import lombok.Getter;

@Getter
public class LoginCommand {
    private final String username;
    private final String password;

    public LoginCommand(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        if (password == null || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
        
        this.username = username.trim();
        this.password = password.trim();
    }
} 