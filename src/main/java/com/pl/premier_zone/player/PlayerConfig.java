package com.pl.premier_zone.player;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository repository) {
        return args -> {
            Player gabriel = new Player(
                    "Gabriel"
            );

            Player alex = new Player(
                    "Alex"
            );

            repository.saveAll(List.of(gabriel, alex));
        };
    }
}
