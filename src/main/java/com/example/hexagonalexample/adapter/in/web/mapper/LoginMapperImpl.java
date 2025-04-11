package com.example.hexagonalexample.adapter.in.web.mapper;

import com.example.hexagonalexample.adapter.in.web.LoginRequest;
import com.example.hexagonalexample.application.port.in.command.LoginCommand;
import org.springframework.stereotype.Component;

@Component
public class LoginMapperImpl implements LoginMapper {
    
    @Override
    public LoginCommand toCommand(LoginRequest request) {
        return new LoginCommand(request.getUsername(), request.getPassword());
    }
} 