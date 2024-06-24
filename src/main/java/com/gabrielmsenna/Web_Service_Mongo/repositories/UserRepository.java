package com.gabrielmsenna.Web_Service_Mongo.repositories;

import com.gabrielmsenna.Web_Service_Mongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
