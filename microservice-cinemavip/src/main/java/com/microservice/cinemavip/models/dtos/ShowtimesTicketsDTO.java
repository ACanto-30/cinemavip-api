package com.microservice.cinemavip.models.dtos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ShowtimesTicketsDTO {

    LocalDate showtimeDate;

    private TheatersDTO theater;

    private MoviesShowtimesDTO movie;

}