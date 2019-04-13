package io.angular.repo;

import io.angular.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Integer>, CustomHeroRepository {
}
