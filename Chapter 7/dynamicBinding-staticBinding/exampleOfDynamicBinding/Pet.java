// superclass (parent class) Pet

public abstract class Pet {
  private String color;
  private int years;

  /** default constructor */
  public Pet() {
  }

  /** constructor with formal parameters */
  public Pet(String color, int years) {
	  this.color = color;
	  this.years = years;
  }

  /** getters */
  public String getColor() {
    return color;
  }

  public int getYears() {
    return years;
  }

  /** setters */
  public void setColor(String color) {
    this.color = color;
  }

  public void setYears() {
    this.years = years;
  }

  /** Abstract method  */
  public abstract int calcHumanAge();

}