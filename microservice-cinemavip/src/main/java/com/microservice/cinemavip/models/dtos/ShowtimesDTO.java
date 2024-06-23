package com.microservice.cinemavip.models.dtos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShowtimesDTO {

    int idShowtime;

    LocalDate showtimeDate;

    private TheatersDTO theater;

    private MoviesShowtimesDTO movie;

    private List<ShowtimeHoursDTO> showtimeHours;
}
