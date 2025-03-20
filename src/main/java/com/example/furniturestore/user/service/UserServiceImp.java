package com.example.furniturestore.user.service;

import com.example.furniturestore.user.UserRepository;
import com.example.furniturestore.user.mapper.UserMapper;
import com.example.furniturestore.user.mapper.UserWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final UserMapper UserMapper;

    @Override
    public UserWrapper getUserByUsername(String username) {
        return UserMapper.toUserWrapper(userRepository.findByUsername(username));
    }

    @Override
    public void deleteUser(String username) {
        userRepository.deleteByUsername(username);
    }

    @Override
    public UserWrapper saveUser(UserWrapper userWrapper) {
        return UserMapper.toUserWrapper(userRepository.save(UserMapper.toUserEntity(userWrapper)));
    }

    @Override
    public List<UserWrapper> getAllUsers() {
        return userRepository.findAll().stream().map(UserMapper::toUserWrapper).toList();
    }
}
