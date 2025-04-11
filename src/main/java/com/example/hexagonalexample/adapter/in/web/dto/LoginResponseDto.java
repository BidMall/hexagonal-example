package com.example.hexagonalexample.adapter.in.web.dto;

import lombok.Getter;

@Getter
public class LoginResponseDto {
    private final Long id;
    private final String username;

    public LoginResponseDto(Long id, String username) {
        this.id = id;
        this.username = username;
    }
} 