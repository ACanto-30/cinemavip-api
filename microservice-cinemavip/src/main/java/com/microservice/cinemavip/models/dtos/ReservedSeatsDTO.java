package com.microservice.cinemavip.models.dtos;

import com.microservice.cinemavip.models.entities.Seats;
import com.microservice.cinemavip.models.entities.Tickets;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservedSeatsDTO {
    int idReservedSeat;
    private SeatsDTO seat;
}
