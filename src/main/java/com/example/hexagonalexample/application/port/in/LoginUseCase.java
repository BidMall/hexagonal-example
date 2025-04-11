package com.example.hexagonalexample.application.port.in;

import com.example.hexagonalexample.application.port.in.command.LoginCommand;
import com.example.hexagonalexample.application.port.out.LoginResponse;

public interface LoginUseCase {
    LoginResponse login(LoginCommand command);
} 