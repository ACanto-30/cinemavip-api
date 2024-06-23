package com.microservice.cinemavip.services;

import org.springframework.http.ResponseEntity;

public interface ISeatsService {
    ResponseEntity<?> getSeatsByIdShowTimeHours(int id);
}
