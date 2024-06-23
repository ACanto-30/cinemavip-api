package com.microservice.cinemavip.controllers;

import com.microservice.cinemavip.models.dtos.UsersDTO;
import com.microservice.cinemavip.services.ITicketsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TicketsController {

    @Autowired
    ITicketsService ticketsService;

    @GetMapping("/ticket/user")
    public ResponseEntity<?> getLastTicketByUser(@RequestBody @Valid UsersDTO usersDTO)
    {
        return ticketsService.getLastTicketByUser(usersDTO);
    }

    @GetMapping("/tickets/user")
    public ResponseEntity<?> getAllTicketsByUser(@RequestBody @Valid UsersDTO usersDTO)
    {
        return ticketsService.getAllTicketsByUser(usersDTO);
    }


}
