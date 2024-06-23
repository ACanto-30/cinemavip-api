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
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seat", nullable = false)
    int idSeat;

    @Column(nullable = false)
    String position;

    @OneToMany(mappedBy = "seat", fetch = FetchType.LAZY)
    private List<ReservedSeats> idReservedSeats;
}
