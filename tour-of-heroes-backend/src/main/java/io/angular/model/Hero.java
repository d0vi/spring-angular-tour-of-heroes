package io.angular.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hero {
  @Id
  @GeneratedValue
  private Integer id;
  @Column(nullable = false, unique = true)
  private String name;

  public Hero() {
    // required by Hibernate
  }

  public Hero(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Indicates whether some other object is equals to this
   *
   * @param o: object to compare
   * @return {@code boolean} true if both objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof Hero)) {
      return false;
    }
    Hero heroToCompare = (Hero) o;
    return heroToCompare.getId().equals(id) &&
      heroToCompare.getName().equals(name);
  }

  /**
   * Returns a hash code value for the object
   *
   * @return {@code int} a hash code value for this object
   */
  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + id.hashCode();
    return result;
  }

  /**
   * Returns the string representation of this Hero
   *
   * @return {@code string} definition of the object
   */
  @Override
  public String toString() {
    return "Hero(id=" + id + ", name=" + name + ")";
  }
}
