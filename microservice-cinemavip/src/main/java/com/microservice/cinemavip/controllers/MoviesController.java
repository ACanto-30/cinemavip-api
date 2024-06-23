package com.microservice.cinemavip.controllers;

import com.microservice.cinemavip.services.IMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MoviesController {

    @Autowired
    private IMoviesService moviesService;

    @GetMapping("movies")
    public ResponseEntity<?> listAllMovies()
    {
        return moviesService.listAllMovies();
    }

    @GetMapping("movie/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable int id)
    {
        return moviesService.getMovieById(id);
    }
}