package com.example.furniturestore.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {
    private final Dotenv dotenv = Dotenv.load();

    @Bean
    public MongoClient mongoClient() {
        String connectionString = dotenv.get("MONGO_DB_STRING_CONNECTION");

        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory(mongoClient(), dotenv.get("MONGO_DB_NAME"));
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoDatabaseFactory());
    }

    @Bean
    public MongoTransactionManager mongoTransactionManager() {
        return new MongoTransactionManager(mongoDatabaseFactory());
    }
}
