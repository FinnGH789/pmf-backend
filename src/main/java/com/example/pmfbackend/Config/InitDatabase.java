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
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(11L, "Verkauf von Möbeln", 300)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(12L, "Erstattung von Reisekosten", 80)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(13L, "Gewinn aus Lotterie", 500)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(14L, "Nebenjob", 200)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(15L, "Aktiengewinne", 250)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(16L, "Crowdfunding Unterstützung", 60)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(17L, "Erbschaft", 1000)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(18L, "Rückerstattung von Versicherungen", 120)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(19L, "Preisgeld von Wettbewerb", 400)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(20L, "Mieteinnahmen", 700)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(21L, "Garage Vermietung", 50)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(22L, "Geburtstagsgeld", 100)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(23L, "Verkauf von Elektronik", 150)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(24L, "Freunde Rückzahlung", 40)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(25L, "Pensionseinkommen", 900)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(26L, "Online-Plattform Einnahmen", 300)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(27L, "Messe Stand-Verkauf", 200)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(28L, "Verkauf alter Kleidung", 70)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(29L, "Einnahmen aus Beratung", 600)));
            LOGGER.info("Preloading Einnahme: {}", einnahmenRepository.save(new Einnahmen(30L, "Vermietung Kamera-Equipment", 90)));


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
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(21L, "Restaurantbesuch", 45)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(22L, "Urlaub", 800)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(23L, "Haushaltswaren", 120)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(24L, "Stromrechnung", 70)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(25L, "Fitnessstudio", 40)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(26L, "Bücher", 20)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(27L, "Öffentliche Verkehrsmittel", 50)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(28L, "Haustierbedarf", 30)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(29L, "Arztkosten", 100)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(30L, "Werkzeug", 75)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(31L, "Streaming Dienste", 20)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(32L, "Gaming", 35)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(33L, "Schulgebühren", 500)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(34L, "Wohnungsreparaturen", 150)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(35L, "Freizeitpark", 60)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(36L, "Kleidung", 200)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(37L, "Kinderbetreuung", 250)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(38L, "Schulmaterialien", 45)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(39L, "Musikinstrumente", 300)));
            LOGGER.info("Preloading Ausgabe: {}", ausgabenRepository.save(new Ausgaben(40L, "Hobbyzubehör", 55)));


        };
    }
}
