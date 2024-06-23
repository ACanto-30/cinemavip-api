package com.microservice.cinemavip.services.implementations;

import com.microservice.cinemavip.models.daos.interfaces.IUserDAO;
import com.microservice.cinemavip.models.dtos.UsersDTO;
import com.microservice.cinemavip.models.entities.Users;
import com.microservice.cinemavip.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserImplementationService implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public ResponseEntity<?> createUserIfNotExist(UsersDTO usersDTO) {
        Users user = Users.builder()
                .firstName(usersDTO.getFirstName())
                .lastName(usersDTO.getLastName())
                .email(usersDTO.getEmail())
                .build();
        if (userDAO.searchUser(user) == null) {
            saveUser(user);
            return new ResponseEntity<>(usersDTO, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(usersDTO, HttpStatus.OK);
        }
    }

    @Transactional
    public void saveUser(Users user)
    {
        userDAO.save(user);
    }

    @Transactional(readOnly = true)
    public Users findUser(Users user) {
        Users userFinded = userDAO.searchUser(user);
        if (userFinded != null)
            return userFinded;
        else
            return null;
    }

}
