package com.microservice.cinemavip.models.dtos;

import com.microservice.cinemavip.models.entities.Tickets;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ShowtimeHoursTicketsDTO {
    private int idShowtimeHour;
    private ShowtimesTicketsDTO showtime;
}
