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
public class Showtimes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_showtime", nullable = false)
    int idShowtime;

    @Column(name = "showtime_date", nullable = false)
    LocalDate showtimeDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_theater", nullable = false)
    private Theaters theater;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_movie", nullable = false)
    private Movies movie;

    @OneToMany(mappedBy = "showtime", fetch = FetchType.LAZY)
    private List<ShowtimeHours> showtimeHours;
}
