package io.angular.web;

class HeroNoTermCoincidenceException extends RuntimeException {
  HeroNoTermCoincidenceException() {
    super();
  }

  HeroNoTermCoincidenceException(final String term) {
    super("No coincidences for term " + term);
  }
}
