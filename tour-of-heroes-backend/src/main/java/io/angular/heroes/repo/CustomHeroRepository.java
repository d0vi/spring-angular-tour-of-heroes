package io.angular.heroes.repo;

import io.angular.heroes.model.Hero;

import java.util.List;

public interface CustomHeroRepository {
  List<Hero> findByName(String term);
}
