package com.gabrielmsenna.Web_Service_Mongo.services;

import com.gabrielmsenna.Web_Service_Mongo.domain.User;
import com.gabrielmsenna.Web_Service_Mongo.repositories.UserRepository;
import com.gabrielmsenna.Web_Service_Mongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> userObj = userRepository.findById(id);
        return userObj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }
}
