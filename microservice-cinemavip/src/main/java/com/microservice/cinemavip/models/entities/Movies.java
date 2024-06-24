package com.microservice.cinemavip.models.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movie", nullable = false)
    int idMovie;

    @Column(nullable = false)
    String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    String synopsis;

    @Column(nullable = false)
    int duration;

    @Column(nullable = false)
    String image;

    @Column(name = "release_date", nullable = false)
    LocalDate releaseDate;

    @Column(nullable = false)
    String director;

    @Column(nullable = false)
    String genre;

    @Column(nullable = false, columnDefinition = "TEXT")
    String url;

    @Column(nullable = false, name = "trailer_title", columnDefinition = "TEXT")
    String trailerTitle;

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    List<Casts> cast;

    @OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
    private List<Showtimes> showtimes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_classification", nullable = false)
    private Classifications classification;

}