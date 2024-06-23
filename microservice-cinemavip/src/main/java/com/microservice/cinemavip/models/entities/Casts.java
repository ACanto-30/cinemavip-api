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
public class Casts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cast", nullable = false)
    int idCast;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_actor", nullable = false)
    private Actors actor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_movie", nullable = false)
    private Movies movie;

}
