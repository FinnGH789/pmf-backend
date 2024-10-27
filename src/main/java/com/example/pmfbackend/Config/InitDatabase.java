package com.example.pmfbackend.Config;

import com.example.pmfbackend.Entity.Ausgaben;
import com.example.pmfbackend.Entity.Einnahmen;
import com.example.pmfbackend.Repository.FinanzenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDatabase {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitDatabase.class);

    @Bean
    CommandLineRunner test(FinanzenRepository finanzenRepository) {
        return args -> {
            LOGGER.info("Preloading " + finanzenRepository.save(new Ausgaben(2L, "Friseur", 15)));
            LOGGER.info("Preloading " + finanzenRepository.save(new Einnahmen(1L, "Taschengeld", 10)));
        };
    }
}
