package com.microservice.cinemavip.services;

import org.springframework.http.ResponseEntity;

public interface IShowtimesService {
    ResponseEntity<?> getShowtimesByMovieId(int id);
}
