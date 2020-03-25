/** Program header:  Apple.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class defines the private data fields in Apple class:
 *     price per pounds, and how many pounds.
 *   It also provide a default constructor, and a constructor with four parameters,  
 *     in addition to regular getters and setters for all private data members.
 *   The effector is use to calculate the price.
 */

public class Apple extends Fruit{

	public static final double ORGANIC_APPLE_PRICE_RAISE = 0.4;
	private double pricePerPound;
	private double pounds;
	
	public Apple(){
		this("Sunshine Farm", true, 2.48, 3.5);
	}

	public Apple(String whichFarm, boolean organic, double pricePerPound, double pounds){
		super(whichFarm, organic); // these two parameter are used to initialize the two inherited data fields.
		this.pricePerPound = pricePerPound; // this line and the line below are to initialize the two private data fields.
		this.pounds = pounds;
	}
	
	public double getPricePerPound(){
		return pricePerPound;
	}
	
	public double getPounds(){
		return pounds;
	}
	
	public void setPricePerPound(double pricePerPound){
		this.pricePerPound = pricePerPound;
	}

	public void setPounds(double pounds){
		this.pounds = pounds;
	}
	
	public double calcPrice(){
		double price = pricePerPound * pounds;
		
		/**
		  For class Fruit, data field organic is private, so all other classes 
		must use public getter or setter or effector to access organic. 
		  For class Apple, data field organic is an inherited field from its 
		superclass Fruit, so there is a field named organic in every Apple object. 
		And because field organic is private in class Fruit, so in class Apple, 
		we have to use the public getter isOrganic() to read the value of organic. 
		If we try to access field organic directly in class Apple, it will not compile.
		*/
		//if(organic){ //won't compile if you uncomment this line and comment out the next line.  
		if( isOrganic() ) {  
			price *= (1 + ORGANIC_APPLE_PRICE_RAISE); // for organic apple, the price is higher.
		}
		
		return price;
	}
	
}