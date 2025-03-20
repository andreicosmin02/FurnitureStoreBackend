package com.example.furniturestore.user.mapper;


import com.example.furniturestore.user.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserMapper {

    // Convert UserEntity to UserWrapper
    public UserWrapper toUserWrapper(UserEntity userEntity) {
        if (userEntity == null) return null;

        return UserWrapper.builder()
                .id(userEntity.getId())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .build();
    }

    // Convert UserWrapper to UserResource
    public static UserResource toUserResource(UserWrapper userWrapper) {
        if (userWrapper == null) return null;

        return UserResource.builder()
                .id(userWrapper.getId())
                .username(userWrapper.getUsername())
                .password(userWrapper.getPassword())
                .build();
    }

    // Convert UserWrapper to UserEntity
    public UserEntity toUserEntity(UserWrapper userWrapper) {
        if (userWrapper == null) return null;

        return UserEntity.builder()
                .id(userWrapper.getId())
                .username(userWrapper.getUsername())
                .password(userWrapper.getPassword())
                .build();
    }

    // Convert UserResource to UserWrapper
    public static UserWrapper toUserWrapper(UserResource userResource) {
        if (userResource == null) return null;

        return UserWrapper.builder()
                .id(userResource.getId())
                .username(userResource.getUsername())
                .password(userResource.getPassword())
                .build();
    }
}
