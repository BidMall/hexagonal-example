package com.example.hexagonalexample.adapter.in.web.mapper;

import com.example.hexagonalexample.adapter.in.web.LoginRequest;
import com.example.hexagonalexample.adapter.in.web.dto.LoginResponseDto;
import com.example.hexagonalexample.application.port.in.command.LoginCommand;
import com.example.hexagonalexample.application.port.out.LoginResponse;

public interface LoginMapper {
    LoginCommand toCommand(LoginRequest request);
    LoginResponseDto toDto(LoginResponse response);
} 