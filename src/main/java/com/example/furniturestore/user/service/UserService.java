package com.example.furniturestore.user.service;

import com.example.furniturestore.user.mapper.UserWrapper;

import java.util.List;

public interface UserService {

    UserWrapper getUserByUsername(String username);

    void deleteUser(String username);

    UserWrapper saveUser(UserWrapper userWrapper);

    List<UserWrapper> getAllUsers();
}
