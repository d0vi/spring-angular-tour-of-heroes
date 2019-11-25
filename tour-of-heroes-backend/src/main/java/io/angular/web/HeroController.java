package io.angular.web;

import io.angular.model.Hero;
import io.angular.repo.HeroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/heroes")
public class HeroController {
  private final HeroRepository heroRepository;

  public HeroController(HeroRepository heroRepository) {
    this.heroRepository = heroRepository;
  }

  @GetMapping
  public List<Hero> getHeroes(@RequestParam(value = "name", required = false) String term) {
    if (term != null) {
      List<Hero> heroesMatchingTerm = heroRepository.findByName(term);
      if (heroesMatchingTerm.isEmpty()) {
        throw new HeroNoTermCoincidenceException(term);
      }
      return heroesMatchingTerm;
    }
    return heroRepository.findAll();
  }

  @GetMapping("/{id}")
  public Hero getHero(@PathVariable Integer id) {
    return heroRepository.findById(id)
      .orElseThrow(() -> new HeroNotFoundException(id));
  }

  @PostMapping
  public Hero createHero(@RequestBody Hero hero) {
    return heroRepository.save(hero);
  }

  @PutMapping("/{id}")
  public Hero updateHero(@RequestBody Hero updatedHero, @PathVariable Integer id) {
    if (updatedHero.getId() != null && !updatedHero.getId().equals(id)) {
      throw new HeroIdMismatchException();
    }
    return heroRepository.findById(id)
      .map(hero -> {
        hero.setName(updatedHero.getName());
        return heroRepository.save(hero);
      })
      .orElseGet(() -> {
        updatedHero.setId(id);
        return heroRepository.save(updatedHero);
      });
  }

  @DeleteMapping("/{id}")
  public void deleteHero(@PathVariable Integer id) {
    heroRepository.deleteById(id);
  }
}
