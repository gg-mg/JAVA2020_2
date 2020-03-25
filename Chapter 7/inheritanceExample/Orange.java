/** Program header:  Orange.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class defines the private data fields in Orange class:
 *     price per bag, and how many bags.
 *   It also provide a default constructor, and a constructor with four parameters,  
 *     in addition to regular getters and setters for all private data members.
 *   The effector is use to calculate the price.
 */
 
public class Orange extends Fruit{

	public static final double ORGANIC_ORANGE_PRICE_RAISE = 0.2;
	private double pricePerBag;
	private int bags;
	
	public Orange(){
		this("Sunshine Farm", true, 5.25, 2);
	}

	public Orange(String whichFarm, boolean organic, double pricePerBag, int bags){
		super(whichFarm, organic); // these two parameter are used to initialize the two inherited data fields.
		this.pricePerBag = pricePerBag;  // this line and the line below are to initialize the two private data fields. 
		this.bags = bags;
	}
	
	public double getPricePerBag(){
		return pricePerBag;
	}
	
	public int getBags(){
		return bags;
	}
	
	public void setPricePerBag(double pricePerBag){
		this.pricePerBag = pricePerBag;
	}

	public void setBags(int bags){
		this.bags = bags;
	}
	
	public double calcPrice(){
		double price = pricePerBag * bags;
		
		/**
		  For class Fruit, data field organic is private, so all other classes 
		must use public getter or setter or effector to access organic. 
		  For class Orange, data field organic is an inherited field from its 
		superclass Fruit, so there is a field named organic in every Orange object. 
		And because field organic is private in class Fruit, so in class Orange, 
		we have to use the public getter isOrganic() to read the value of organic. 
		If we try to access field organic directly in class Orange, it will not compile.
		*/
		//if(organic){ //won't compile if you uncomment this line and comment out the next line.  
		if( isOrganic() ){
			price *= (1 + ORGANIC_ORANGE_PRICE_RAISE); // for organic orange, the price is higher.
		}
		
		return price;
	}
	
}