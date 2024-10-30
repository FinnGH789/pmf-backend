package com.example.pmfbackend.Controller;

import com.example.pmfbackend.Entity.Ausgaben;
import com.example.pmfbackend.Repository.AusgabenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AusgabenController {

    private AusgabenRepository ausgabenRepository;

    @Autowired
    public AusgabenController(AusgabenRepository ausgabenRepository) {
        this.ausgabenRepository = ausgabenRepository;
    }

    @GetMapping("/ausgaben")
    public List<Ausgaben> getAllAusgaben() {
        return ausgabenRepository.findAll();
    }
}
