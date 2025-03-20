package com.example.furniturestore.user;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@Data
@Builder
public class UserEntity {
    @Id
    private String id = UUID.randomUUID().toString();

    private String username;

    private String password;
}


