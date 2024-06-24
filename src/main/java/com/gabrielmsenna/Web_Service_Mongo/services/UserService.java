package com.gabrielmsenna.Web_Service_Mongo.services;

import com.gabrielmsenna.Web_Service_Mongo.domain.User;
import com.gabrielmsenna.Web_Service_Mongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
