package io.angular.web;

public class HeroNotFoundException extends RuntimeException {
  public HeroNotFoundException() {
    super();
  }

  public HeroNotFoundException(final Integer id) {
    super("Could not find hero " + id);
  }
}
