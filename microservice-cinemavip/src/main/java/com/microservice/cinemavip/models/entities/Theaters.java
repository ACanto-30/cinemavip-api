package com.microservice.cinemavip.models.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Theaters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_theater", nullable = false)
    int idTheater;

    @Column(name = "theater_number", nullable = false)
    int theaterNumber;

    @OneToMany(mappedBy = "theater", fetch = FetchType.LAZY)
    private List<Showtimes> showtimes;
}

