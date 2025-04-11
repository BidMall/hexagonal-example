package com.example.hexagonalexample.application.service;

import com.example.hexagonalexample.adapter.in.web.dto.LoginResponse;
import com.example.hexagonalexample.application.port.in.LoginUseCase;
import com.example.hexagonalexample.application.port.in.command.LoginCommand;
import com.example.hexagonalexample.application.port.out.LoadUserPort;
import com.example.hexagonalexample.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginUseCase {
    private final LoadUserPort loadUserPort;

    @Override
    public LoginResponse login(LoginCommand command) {
        User user = loadUserPort.loadUser(command.getUsername(), command.getPassword());
        return new LoginResponse(user.getId(), user.getUsername());
    }
} 