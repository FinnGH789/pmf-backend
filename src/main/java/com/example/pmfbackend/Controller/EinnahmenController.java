package com.example.pmfbackend.Controller;


import com.example.pmfbackend.Entity.Einnahmen;
import com.example.pmfbackend.Repository.EinnahmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@RestController
public class EinnahmenController {

    private final EinnahmenRepository einnahmenRepository;

    @Autowired
    public EinnahmenController(EinnahmenRepository einnahmenRepository) {
        this.einnahmenRepository = einnahmenRepository;
    }

    @GetMapping("/einnahmen")
    public List<Einnahmen> getAllEinnahmen() {
        return einnahmenRepository.findAll();
    }

    @PostMapping("/addEinnahmen")
    public Einnahmen addEinnahmen(@RequestBody Einnahmen einnahmen) {
        return einnahmenRepository.save(einnahmen);
    }

    public AtomicReference<Float> getSumEinnahmen() {
        List<Einnahmen> sumList = einnahmenRepository.findAll();
        AtomicReference<Float> sum = new AtomicReference<>((float) 0);
        sumList.forEach(einnahmen -> {
            sum.set(sumList.stream()
                    .map(Einnahmen::getEinnahme)
                    .reduce(0f, Float::sum));
        });
        return sum;
    }

}
