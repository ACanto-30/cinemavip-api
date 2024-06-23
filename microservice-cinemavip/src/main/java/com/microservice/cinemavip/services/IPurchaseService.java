package com.microservice.cinemavip.services;

import com.microservice.cinemavip.models.dtos.PurchaseDTO;
import org.springframework.http.ResponseEntity;

public interface IPurchaseService {
    ResponseEntity<?> purchaseTickets(PurchaseDTO purchaseDTO);
}
