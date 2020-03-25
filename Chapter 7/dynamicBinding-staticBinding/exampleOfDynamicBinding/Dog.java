// Dog is a subclass of Pet, in other words, a child class of Pet
public class Dog extends Pet {
  private String breed;

  /** constructors */
  public Dog() {
  }

  public Dog(String color, int years, String breed) {
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
    return 9 * getYears();   // a rough estimation of dog's equivalent human age
  }

}
