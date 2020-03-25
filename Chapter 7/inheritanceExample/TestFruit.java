/** Program header:  TestFruit.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class is the application class that has the main method.
 *   It creates several orange and apple objects with directly plugged in parameters.
 *   It also asks for user input parameters to initialize an orange object.
 *   It demonstrate the use of constructor with all parameters, 
 *      and the use of default constructor and then the use of setters.
 *   Then it calculate and output the fruit characteristics such as farm and price, etc.
 */

import java.util.Scanner;

public class TestFruit{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		// plug in 4 parameters in the constructor below, 
		// with the first two parameters to initialize the two inherited data fields of class Orange,
		// and the last two to initialize the two private data fields of class Orange 
		Orange myOrange = new Orange("Inn Farm", true, 3.0, 2);
		
		Orange hisOrange = new Orange();
		
		// get the data fields of hisOrange from user input :
		System.out.println("For his orange purchase: ");
		System.out.print("Please input the farm name: ");
		String farmName = input.nextLine();
		
		System.out.print("Please input it is organic or not (true or false): ");
		boolean organicFood = input.nextBoolean();

		System.out.print("Please input the price per bag: ");
		double unitPrice = input.nextDouble();

		System.out.print("Please input the number of bags: ");
		int numberOfBags = input.nextInt();

		// set the data fields into hisOrange:
		hisOrange.setWhichFarm(farmName);	// Subclass Orange inherits public method setWhichFarm() from Superclass Fruit
		hisOrange.setOrganic(organicFood);	// Subclass Orange inherits public method setOrganic() from Superclass Fruit
		hisOrange.setPricePerBag(unitPrice);// public method setPricePerBag() is defined in class Orange
		hisOrange.setBags(numberOfBags);	// public method setBags() is defined in class Orange
		
		Apple myApple = new Apple("Penn Farm", true, 2.79, 4.5);
		Apple hisApple = new Apple("Hope Farm", false, 1.65, 3.5);
		
		// calculate the prices
		double myOrangePrice = myOrange.calcPrice();
		double hisOrangePrice = hisOrange.calcPrice();
		
		double myApplePrice = myApple.calcPrice();
		double hisApplePrice = hisApple.calcPrice();
		
		// output the results. Notice that:
		// Subclass Orange inherits public method getWhichFarm() from Superclass Fruit, and
		// Subclass Orange inherits public method isOrganic() from Superclass Fruit, and 
		// method getPricePerBag() and method getBags() are defined in class Orange. 
		System.out.println("\nfor my orange purchase:");
		System.out.printf("the farm is: %12s, organic: %5s \n", myOrange.getWhichFarm(), myOrange.isOrganic() );
		System.out.printf("price per bag:%6.2f, number of bags: %4d \n", myOrange.getPricePerBag(), myOrange.getBags() );
		System.out.printf("total price: %7.2f\n\n", myOrangePrice);
		
		System.out.println("for his orange purchase:");
		System.out.printf("the farm is: %12s, organic: %5s \n", hisOrange.getWhichFarm(), hisOrange.isOrganic() );
		System.out.printf("price per bag:%6.2f, number of bags: %4d \n", hisOrange.getPricePerBag(), hisOrange.getBags() );
		System.out.printf("total price: %7.2f\n\n", hisOrangePrice);
		
		// Notice that:
		// Subclass Apple inherits public method getWhichFarm() from Superclass Fruit, and
		// Subclass Apple inherits public method isOrganic() from Superclass Fruit, and 
		// method getPricePerPound() and method getPounds() are defined in class Apple. 
		System.out.println("for my apple purchase:");
		System.out.printf("the farm is: %12s, organic: %5s \n", myApple.getWhichFarm(), myApple.isOrganic() );
		System.out.printf("price per bag:%6.2f, number of bags: %5.2f \n", myApple.getPricePerPound(), myApple.getPounds() );
		System.out.printf("total price: %7.2f\n\n", myApplePrice);

		System.out.println("for his apple purchase:");
		System.out.printf("the farm is: %12s, organic: %5s \n", hisApple.getWhichFarm(), hisApple.isOrganic() );
		System.out.printf("price per bag:%6.2f, number of bags: %5.2f \n", hisApple.getPricePerPound(), hisApple.getPounds() );
		System.out.printf("total price: %7.2f\n\n", hisApplePrice);
	} // end of main method
} // end of class