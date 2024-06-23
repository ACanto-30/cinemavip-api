package com.microservice.cinemavip.models.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoviesDTO {

    int idMovie;

    String title;

    String synopsis;

    int duration;

    String image;

    LocalDate releaseDate;

    String director;

    String genre;

    String url;

    String trailerTitle;

    ClassificationsDTO idClassification;

}
