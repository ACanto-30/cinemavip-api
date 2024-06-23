package com.microservice.cinemavip.controllers;

import com.microservice.cinemavip.services.ISeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SeatsController {

    @Autowired
    ISeatsService showtimehoursService;

    @GetMapping("/showtimehour/{id}/seats")
    public ResponseEntity<?> showtimes(@PathVariable int id)
    {
        return showtimehoursService.getSeatsByIdShowTimeHours(id);
    }
}
