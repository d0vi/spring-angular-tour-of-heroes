package io.angular.heroes.repo;

import io.angular.heroes.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Integer>, CustomHeroRepository {
}
