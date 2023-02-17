package com.br.profile.entity;

import com.br.profile.constant.Gender;
import com.br.profile.dto.MotorcycleDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "PROFILE")
public class ProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFILE_SEQ")
    private Long id;

    private String name;

    private Gender gender;

    private Date birthday;

    @ManyToOne
    private MotorcycleEntity motorcycle;

}
