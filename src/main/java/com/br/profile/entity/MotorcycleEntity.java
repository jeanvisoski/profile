package com.br.profile.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PROFILE")
public class MotorcycleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFILE_SEQ")
    private Long id;

    private String brand;

    private String model;

    private String year;

}
