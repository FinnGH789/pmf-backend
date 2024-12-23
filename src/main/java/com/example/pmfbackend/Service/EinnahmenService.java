package com.example.pmfbackend.Service;

import com.example.pmfbackend.Entity.Einnahmen;
import com.example.pmfbackend.Repository.EinnahmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EinnahmenService {

    @Autowired
    private EinnahmenRepository einnahmenRepository;

    public List<Einnahmen> getEinnahmen() {
        return einnahmenRepository.findAll();
    }

    public Einnahmen addEinahme(Einnahmen einnahmen) {
        return einnahmenRepository.save(einnahmen);
    }

    public Float getTotalEinnahmen() {
        return einnahmenRepository.findAll()
                .stream()
                .map(Einnahmen::getBetrag)
                .reduce(0f, Float::sum);
    }
}
