package com.microservice.cinemavip.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoviesShowtimesDTO {
    int idMovie;

    String title;

    String synopsis;

    int duration;

    String image;

    LocalDate releaseDate;

    String director;

    String genre;
}
