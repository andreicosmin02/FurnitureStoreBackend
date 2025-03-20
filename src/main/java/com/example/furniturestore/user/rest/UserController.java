package com.example.furniturestore.user.rest;

import com.example.furniturestore.user.mapper.UserMapper;
import com.example.furniturestore.user.mapper.UserResource;
import com.example.furniturestore.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public UserResource save(@RequestBody UserResource userResource){
        return UserMapper.toUserResource(userService.saveUser(UserMapper.toUserWrapper(userResource)));
    }

    @GetMapping
    public List<UserResource> findAll(){
        return userService.getAllUsers().stream().map(UserMapper::toUserResource).toList();
    }



}
