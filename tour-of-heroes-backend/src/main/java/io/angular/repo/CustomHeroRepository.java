package io.angular.repo;

import io.angular.model.Hero;

import java.util.List;

public interface CustomHeroRepository {
  List<Hero> findByName(String term);
}
