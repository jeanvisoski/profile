package com.br.profile.dto;

import com.br.profile.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PilotDTO {

    private String name;

    private Gender gender;

    private Date birthday;

    private MotorcycleDTO motorcycle;

}
