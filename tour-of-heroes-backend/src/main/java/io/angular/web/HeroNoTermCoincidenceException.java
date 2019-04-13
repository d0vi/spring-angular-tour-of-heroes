package io.angular.web;

public class HeroNoTermCoincidenceException extends RuntimeException {
  public HeroNoTermCoincidenceException() {
    super();
  }

  public HeroNoTermCoincidenceException(final String term) {
    super("No coincidences for term " + term);
  }
}
