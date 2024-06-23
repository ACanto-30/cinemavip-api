package com.microservice.cinemavip.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDTO {
    private UsersDTO user;
    private ShowtimeHoursDTO showtimeHour;
    private List<ReservedSeatsPurchaseDTO> reservedSeats;
}
