package com.microservice.cinemavip.models.dtos;

import com.microservice.cinemavip.models.entities.Showtimes;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TheatersDTO {

    int idTheater;

    int theaterNumber;

}
