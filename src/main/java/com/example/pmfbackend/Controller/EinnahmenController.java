package com.example.pmfbackend.Controller;


import com.example.pmfbackend.Entity.Einnahmen;
import com.example.pmfbackend.Service.EinnahmenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RestController
public class EinnahmenController {

    @Autowired
    private EinnahmenService einnahmenService;

    @GetMapping("/einnahmen")
    private List<Einnahmen> getAllEinnahmen() {
        return einnahmenService.getEinnahmen();
    }

    @PostMapping("/addEinnahmen")
    private Einnahmen addEinnahmen(@RequestBody Einnahmen einnahmen) {
        return einnahmenService.addEinahme(einnahmen);
    }

    @GetMapping("/totalEinnahmen")
    private float getSumEinnahmen() {
        return einnahmenService.getTotalEinnahmen();
    }
}
