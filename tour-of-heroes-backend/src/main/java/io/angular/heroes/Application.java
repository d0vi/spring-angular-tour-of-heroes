package io.angular.heroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "io.angular")
@EnableJpaRepositories("io.angular.heroes.repo")
@EntityScan("io.angular.heroes.model")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}