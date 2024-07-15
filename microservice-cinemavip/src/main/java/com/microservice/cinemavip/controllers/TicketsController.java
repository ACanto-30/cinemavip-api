package com.microservice.cinemavip.controllers;

import com.microservice.cinemavip.models.dtos.UsersDTO;
import com.microservice.cinemavip.services.ITicketsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TicketsController {

    @Autowired
    ITicketsService ticketsService;

    @GetMapping("/ticket/user")
    public ResponseEntity<?> getLastTicketByUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email)
    {
        UsersDTO usersDTO = new UsersDTO(firstName, lastName, email);
        return ticketsService.getLastTicketByUser(usersDTO);
    }

    @GetMapping("/tickets/user")
    public ResponseEntity<?> getAllTicketsByUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email)
    {
        UsersDTO usersDTO = new UsersDTO(firstName, lastName, email);
        return ticketsService.getAllTicketsByUser(usersDTO);
    }

    @GetMapping("/ticket/{id}")
    public ResponseEntity<?> getTicketById(@PathVariable int id)
    {
        return ticketsService.getTicketById(id);
    }
}
