package io.angular.heroes.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HeroNoTermCoincidenceAdvice {
  @ResponseBody
  @ExceptionHandler(HeroNoTermCoincidenceException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String heroNoTermCoincidenceHandler(HeroNoTermCoincidenceException e) {
    return e.getMessage();
  }
}
