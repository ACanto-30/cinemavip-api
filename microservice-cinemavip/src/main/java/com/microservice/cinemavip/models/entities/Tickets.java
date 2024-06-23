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
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ticket", nullable = false)
    int idTicket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", nullable = false)
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_showtime_hour", nullable = false)
    private ShowtimeHours showtimeHour;

    @OneToMany(mappedBy = "tickets", fetch = FetchType.LAZY)
    private List<ReservedSeats> reservedSeats;
}
