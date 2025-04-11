package com.example.hexagonalexample.adapter.in.web;

import com.example.hexagonalexample.adapter.in.web.dto.LoginResponseDto;
import com.example.hexagonalexample.adapter.in.web.mapper.LoginMapper;
import com.example.hexagonalexample.application.port.in.LoginUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LoginController {
    private final LoginUseCase loginUseCase;
    private final LoginMapper loginMapper;

    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody LoginRequest request) {
        return loginMapper.toDto(loginUseCase.login(loginMapper.toCommand(request)));
    }
} 