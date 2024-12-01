package com.example.pmfbackend.Service;

import com.example.pmfbackend.Entity.Ausgaben;
import com.example.pmfbackend.Repository.AusgabenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AusgabenService {

    @Autowired
    private AusgabenRepository ausgabenRepository;

    public List<Ausgaben> getAusgaben() {
        return ausgabenRepository.findAll();
    }

    public Ausgaben addAusgaben(Ausgaben ausgaben) {
        return ausgabenRepository.save(ausgaben);
    }

    public Float getTotalAusgaben() {
        return ausgabenRepository.findAll()
                .stream()
                .map(Ausgaben::getAusgaben)
                .reduce(0f, Float::sum);
    }
}
