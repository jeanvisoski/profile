package com.br.profile.controller;

import com.br.profile.dto.PilotDTO;
import com.br.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @PostMapping
    public ResponseEntity<String> createProfile(@RequestBody PilotDTO pilotDTO) {

        profileService.createProfile(pilotDTO);

        return null;
    }
}
