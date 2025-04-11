package com.example.hexagonalexample.application.port.in;

import com.example.hexagonalexample.application.port.in.command.LoginCommand;
import com.example.hexagonalexample.domain.User;

public interface LoginUseCase {
    User login(LoginCommand command);
} 