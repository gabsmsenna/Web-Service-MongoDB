package com.gabrielmsenna.Web_Service_Mongo.config;

import com.gabrielmsenna.Web_Service_Mongo.domain.User;
import com.gabrielmsenna.Web_Service_Mongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class Instantion implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        List<User> users = List.of(new User(null, "maria", "maria@gmail.com"),
        new User(null, "alex", "alex@gmail.com"),
        new User(null, "bob", "bob@gmail.com"));

        userRepository.saveAll(users);
    }
}
