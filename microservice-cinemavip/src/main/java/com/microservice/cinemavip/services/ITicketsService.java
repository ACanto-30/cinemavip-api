package com.microservice.cinemavip.services;


import com.microservice.cinemavip.models.dtos.UsersDTO;
import org.springframework.http.ResponseEntity;

public interface ITicketsService {
    ResponseEntity<?> getLastTicketByUser(UsersDTO usersDTO);
    ResponseEntity<?> getAllTicketsByUser(UsersDTO usersDTO);
}
