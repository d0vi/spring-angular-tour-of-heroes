package io.angular.heroes.repo;

import io.angular.heroes.model.Hero;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CustomHeroRepositoryImpl implements CustomHeroRepository {
  private EntityManager entityManager;

  public CustomHeroRepositoryImpl(final EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  public List<Hero> findByName(String term) {
    CriteriaBuilder cb = entityManager.getCriteriaBuilder();
    CriteriaQuery<Hero> cq = cb.createQuery(Hero.class);
    Root<Hero> hero = cq.from(Hero.class);
    cq.select(hero);
    TypedQuery<Hero> tq = entityManager.createQuery(cq);
    List<Hero> heroes = tq.getResultList();
    return heroes.stream()
        .filter(h -> h.getName().toLowerCase().contains(term.toLowerCase()))
        .collect(toList());
  }
}
