package com.microservice.cinemavip.controllers;


import com.microservice.cinemavip.models.dtos.UsersDTO;
import com.microservice.cinemavip.services.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("user")
    public ResponseEntity<?> save(@RequestBody @Valid UsersDTO usersDTO)
    {
        return userService.createUserIfNotExist(usersDTO);
    }
}
