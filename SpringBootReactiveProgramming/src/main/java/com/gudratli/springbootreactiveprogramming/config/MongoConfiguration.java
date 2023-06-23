package com.gudratli.springbootreactiveprogramming.config;

import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import jakarta.annotation.Nonnull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;

@Configuration
public class MongoConfiguration extends AbstractReactiveMongoConfiguration
{
    @Value("${spring.data.mongodb.database}")
    private String dbName;

    @Value("${spring.data.mongodb.username}")
    private String username;

    @Value("${spring.data.mongodb.password}")
    private String password;

    @Override
    @Nonnull
    public MongoClient reactiveMongoClient ()
    {
        MongoCredential credential = MongoCredential.createCredential(username, dbName,
                password.toCharArray());
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .credential(credential)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Override
    @Nonnull
    protected String getDatabaseName ()
    {
        return dbName;
    }
}
