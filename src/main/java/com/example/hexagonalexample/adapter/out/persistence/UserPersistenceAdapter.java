package com.example.hexagonalexample.adapter.out.persistence;

import com.example.hexagonalexample.adapter.out.persistence.mapper.UserPersistenceMapper;
import com.example.hexagonalexample.application.port.out.LoadUserPort;
import com.example.hexagonalexample.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserPersistenceAdapter implements LoadUserPort {
    private final UserRepository userRepository;
    private final UserPersistenceMapper userPersistenceMapper;

    @Override
    public User loadUser(String username, String password) {
        UserEntity userEntity = userRepository.findByUsernameAndPassword(username, password)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return userPersistenceMapper.toDomain(userEntity);
    }
} 