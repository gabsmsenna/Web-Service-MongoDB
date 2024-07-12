package com.gabrielmsenna.Web_Service_Mongo.dto;

import com.gabrielmsenna.Web_Service_Mongo.domain.User;

import java.io.Serializable;

public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO() {}

    public UserDTO(User userObj) {
        id = userObj.getId();
        name = userObj.getName();
        email = userObj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
