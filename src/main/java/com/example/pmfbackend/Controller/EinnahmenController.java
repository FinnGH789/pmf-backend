package com.example.pmfbackend.Controller;


import com.example.pmfbackend.Entity.Einnahmen;
import com.example.pmfbackend.Repository.EinnahmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EinnahmenController {

    private EinnahmenRepository einnahmenRepository;

    @Autowired
    public EinnahmenController(EinnahmenRepository einnahmenRepository) {
        this.einnahmenRepository = einnahmenRepository;
    }

    @GetMapping("/einnahmen")
    public List<Einnahmen> getAllEinnahmen() {
        return einnahmenRepository.findAll();
    }
}
