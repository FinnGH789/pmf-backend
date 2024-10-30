package com.example.pmfbackend.Config;

import com.example.pmfbackend.Entity.Ausgaben;
import com.example.pmfbackend.Entity.Einnahmen;
import com.example.pmfbackend.Repository.AusgabenRepository;
import com.example.pmfbackend.Repository.EinnahmenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDatabase {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitDatabase.class);

    @Bean
    CommandLineRunner mockEinnahmenData(EinnahmenRepository einnahmenRepository) {
        return args -> {
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(1L, "Lohn", 1200)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(2L, "Taschengeld", 10)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(3L, "Geld von Oma", 30)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(4L, "Bonuszahlung", 200)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(5L, "Verkauf von Büchern", 25)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(6L, "Miet-Rückzahlung", 150)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(7L, "Freelance Projekt", 400)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(8L, "Steuerrückzahlung", 100)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(9L, "Geschenk", 50)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(10L, "Zinsen auf Sparbuch", 15)));

        };
    }

    @Bean
    CommandLineRunner mockAusgabenData(AusgabenRepository ausgabenRepository) {
        return args -> {
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(11L, "Miete", 600)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(12L, "Lebensmittel", 200)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(13L, "Versicherung", 80)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(14L, "Internet & Telefon", 50)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(15L, "Sportverein", 30)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(16L, "Netflix Abo", 12)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(17L, "Kino", 25)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(18L, "Geschenk für Freunde", 40)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(19L, "Benzin", 60)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(20L, "Friseur", 15)));

        };
    }
}
