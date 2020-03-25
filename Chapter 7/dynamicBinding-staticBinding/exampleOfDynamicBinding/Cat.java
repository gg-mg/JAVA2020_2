// Cat is a subclass of Pet, in other words, a child class of Pet
public class Cat extends Pet {
  private String breed;

  /** constructors */
  public Cat() {
  }

  public Cat(String color, int years, String breed) {
    super(color, years);
    this.breed = breed;
  }

  /** getter */
  public String getBreed() {
    return breed;
  }

  /** setter */
  public void setBreed(String breed) {
    this.breed = breed;
  }

  /** overridden abstract method from superclass */
  public int calcHumanAge() {
    return 7 * getYears();   // a rough estimation of cat's equivalent human age
  }

}
