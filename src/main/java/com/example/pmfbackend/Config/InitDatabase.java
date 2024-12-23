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
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(1L, "Lohn", 1200, "Überweisung")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(2L, "Challenged", 10, "Bargeld")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(3L, "Geld von Oma", 30, "Bargeld")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(4L, "Bonuszahlung", 200, "Überweisung")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(5L, "Verkauf von Büchern", 25, "PayPal")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(6L, "Miet-Rückzahlung", 150, "Banküberweisung")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(7L, "Freelance Projekt", 400, "Kreditkarte")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(8L, "Steuerrückzahlung", 100, "Überweisung")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(9L, "Geschenk", 50, "Bargeld")));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(10L, "Zinsen auf Sparbuch", 15, "Überweisung")));
        };
    }

    @Bean
    CommandLineRunner mockAusgabenData(AusgabenRepository ausgabenRepository) {
        return args -> {
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(11L, "Miete", 600, "Banküberweisung")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(12L, "Lebensmittel", 200, "Bargeld")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(13L, "Versicherung", 80, "Lastschrift")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(14L, "Internet & Telefon", 50, "Kreditkarte")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(15L, "Sportverein", 30, "Bargeld")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(16L, "Netflix Abo", 12, "PayPal")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(17L, "Kino", 25, "Kreditkarte")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(18L, "Geschenk für Freunde", 40, "Bargeld")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(19L, "Benzin", 60, "Bargeld")));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(20L, "Friseur", 15, "Bargeld")));
        };
    }
}
