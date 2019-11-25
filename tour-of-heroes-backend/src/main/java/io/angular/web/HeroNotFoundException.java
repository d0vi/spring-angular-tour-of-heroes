package io.angular.web;

class HeroNotFoundException extends RuntimeException {
  HeroNotFoundException() {
    super();
  }

  HeroNotFoundException(final Integer id) {
    super("Could not find hero " + id);
  }
}
