package com.example.pmfbackend.Controller;

import com.example.pmfbackend.Entity.Ausgaben;
import com.example.pmfbackend.Entity.Einnahmen;
import com.example.pmfbackend.Repository.AusgabenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AusgabenController {

    private final AusgabenRepository ausgabenRepository;

    @Autowired
    public AusgabenController(AusgabenRepository ausgabenRepository) {
        this.ausgabenRepository = ausgabenRepository;
    }

    @GetMapping("/ausgaben")
    public List<Ausgaben> getAllAusgaben() {
        return ausgabenRepository.findAll();
    }

    @PostMapping("/addAusgaben")
    public Ausgaben addAusgaben(@RequestBody Ausgaben ausgaben) {
        return ausgabenRepository.save(ausgaben);
    }
}
