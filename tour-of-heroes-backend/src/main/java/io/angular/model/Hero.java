package io.angular.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Hero {
  @Id
  @GeneratedValue
  private Integer id;
  @Column(nullable = false, unique = true)
  private String name;

  public Hero(String name) {
    this.name = name;
  }
}
