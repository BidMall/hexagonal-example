package com.example.hexagonalexample.adapter.out.persistence.mapper;

import com.example.hexagonalexample.adapter.out.persistence.UserEntity;
import com.example.hexagonalexample.domain.User;

public interface UserPersistenceMapper {
    User toDomain(UserEntity entity);
} 