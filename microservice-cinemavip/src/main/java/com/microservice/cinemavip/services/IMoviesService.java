package com.microservice.cinemavip.services;

import com.microservice.cinemavip.models.dtos.MoviesDTO;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;


import java.util.List;

public interface IMoviesService {
    ResponseEntity<?> listAllMovies();
    ResponseEntity<?> getMovieById(int movieId);
    ResponseEntity<?> listAllComingSoonMovies();
}
