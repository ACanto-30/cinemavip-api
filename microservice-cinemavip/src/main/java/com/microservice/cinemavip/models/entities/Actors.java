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
public class Actors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actor", nullable = false)
    int idActor;

    @Column(name = "actor_name", nullable = false)
    String actorName;

    @OneToMany(mappedBy = "actor", fetch = FetchType.LAZY)
    private List<Casts> cast;

}
