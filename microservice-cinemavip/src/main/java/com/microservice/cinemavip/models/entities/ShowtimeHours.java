package com.microservice.cinemavip.models.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "showtime_hours")
public class ShowtimeHours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_showtime_hour", nullable = false)
    int idShowtimeHour;

    @Column(name = "showtime_hour", nullable = false)
    LocalTime showtimeHour;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_showtime", nullable = false)
    private Showtimes showtime;

    @OneToMany(mappedBy = "showtimeHour", fetch = FetchType.LAZY)
    private List<Tickets> tickets;
}
