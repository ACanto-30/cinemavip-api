package com.microservice.cinemavip.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketsSeatsDTO {
    int idTicket;

    private UsersTicketDTO user;

    private ShowtimeHoursTicketsDTO showtimeHour;

    private List<ReservedSeatsDTO> reservedSeats;
}
