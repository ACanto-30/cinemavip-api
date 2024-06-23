package com.microservice.cinemavip.models.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "reserved_seats")
public class ReservedSeats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserved_seat", nullable = false)
    int idReservedSeat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ticket", nullable = false)
    private Tickets tickets;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_seat", nullable = false)
    private Seats seat;
}
