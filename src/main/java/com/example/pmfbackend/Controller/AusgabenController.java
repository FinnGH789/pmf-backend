package com.example.pmfbackend.Controller;

import com.example.pmfbackend.Entity.Ausgaben;
import com.example.pmfbackend.Service.AusgabenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AusgabenController {

    @Autowired
    private AusgabenService ausgabenService;

    @GetMapping("/ausgaben")
    public List<Ausgaben> getAllAusgaben() {
        return ausgabenService.getAusgaben();
    }

    @PostMapping("/addAusgaben")
    public Ausgaben addAusgaben(@RequestBody Ausgaben ausgaben) {
        return ausgabenService.addAusgaben(ausgaben);
    }

    @GetMapping("/totalAusgaben")
    private float getSumAusgaben() {
        return ausgabenService.getTotalAusgaben();
    }
}
