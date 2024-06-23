package com.microservice.cinemavip.controllers;

import com.microservice.cinemavip.models.dtos.PurchaseDTO;
import com.microservice.cinemavip.services.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PurchaseController {

    @Autowired
    IPurchaseService purchaseService;

    @PostMapping("purchase/ticket")
    public ResponseEntity<?> purchaseTicket(@RequestBody PurchaseDTO purchaseDTO)
    {
        return purchaseService.purchaseTickets(purchaseDTO);
    }
}
