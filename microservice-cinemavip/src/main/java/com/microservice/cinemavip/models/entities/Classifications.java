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
public class Classifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_classification", nullable = false)
    int idClassification;

    @Column(name = "classification_name", nullable = false)
    String classificationName;

    @Column(name = "minimum_age", nullable = false)
    String minimumAge;

    @Column(nullable = false)
    String recommendation;

    @Column(nullable = false)
    String summary;

    @Column(nullable = false)
    String image;

    @OneToOne(mappedBy = "classification", fetch = FetchType.LAZY)
    private Movies movie;
}
