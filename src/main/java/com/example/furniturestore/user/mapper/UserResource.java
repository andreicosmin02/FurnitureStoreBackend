package com.example.furniturestore.user.mapper;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class UserResource {
    private String id;
    private String username;
    private String password;

}