package com.microservice.cinemavip.controllers;

import com.microservice.cinemavip.services.IShowtimesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ShowtimesController {

    @Autowired
    IShowtimesService showtimesService;

    @GetMapping("/showtimes/movie/{id}")
    public ResponseEntity<?> showtimes(@PathVariable int id)
    {
        return showtimesService.getShowtimesByMovieId(id);
    }
}
