package com.microservice.cinemavip.models.daos.interfaces;

import com.microservice.cinemavip.models.entities.Users;

public interface IUserDAO {

    void save(Users user);
    Users searchUser(Users user);
}
