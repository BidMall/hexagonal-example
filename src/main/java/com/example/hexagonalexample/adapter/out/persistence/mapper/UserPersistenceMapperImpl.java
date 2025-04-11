package com.example.hexagonalexample.adapter.out.persistence.mapper;

import com.example.hexagonalexample.adapter.out.persistence.UserEntity;
import com.example.hexagonalexample.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserPersistenceMapperImpl implements UserPersistenceMapper {
    
    @Override
    public User toDomain(UserEntity entity) {
        return new User(entity.getUsername(), entity.getPassword());
    }
} 