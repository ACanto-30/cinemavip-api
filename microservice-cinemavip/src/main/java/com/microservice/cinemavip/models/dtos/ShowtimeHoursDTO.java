package com.microservice.cinemavip.models.dtos;


import com.microservice.cinemavip.models.entities.Showtimes;
import com.microservice.cinemavip.models.entities.Tickets;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShowtimeHoursDTO {
    int idShowtimeHour;
    LocalTime showtimeHour;
}
