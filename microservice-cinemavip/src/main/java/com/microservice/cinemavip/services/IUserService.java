package com.microservice.cinemavip.services;

import com.microservice.cinemavip.models.dtos.UsersDTO;
import com.microservice.cinemavip.models.entities.Users;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    ResponseEntity<?> createUserIfNotExist(UsersDTO usersDTO);
    Users findUser(Users user);
    void saveUser(Users user);
}
