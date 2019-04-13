package io.angular;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

import io.angular.model.Hero;
import io.angular.repo.HeroRepository;

@Configuration
@Slf4j
class LoadDatabase {
  @Bean
  CommandLineRunner initDatabase(HeroRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new Hero("Mr. Nice")));
      log.info("Preloading " + repository.save(new Hero("Narco")));
      log.info("Preloading " + repository.save(new Hero("Bombasto")));
      log.info("Preloading " + repository.save(new Hero("Celeritas")));
      log.info("Preloading " + repository.save(new Hero("Magneta")));
      log.info("Preloading " + repository.save(new Hero("RubberMan")));
      log.info("Preloading " + repository.save(new Hero("Dynama")));
      log.info("Preloading " + repository.save(new Hero("Dr IQ")));
      log.info("Preloading " + repository.save(new Hero("Magma")));
      log.info("Preloading " + repository.save(new Hero("Tornado")));
    };
  }
}
