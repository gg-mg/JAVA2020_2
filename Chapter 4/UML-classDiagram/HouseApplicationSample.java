/** PROGRAM SAMPLE     HouseApplicationSample.java
 *
 * Author:         John Doe
 * Class:          Java, Tuesday and Thursday 1:30pm
 * Due Date:       September 6, 2016
 *
 * Program Description:
 * 	Ask a user to give the square footage and total price of a house
 * 		and invoke a method to do the price per square foot.
*/

import java.util.Scanner;

public class HouseApplicationSample{
	
	public static void main(String[] args){
		//output some basic info 
		System.out.println("John Doe, sample application, Tu/Th, 1:30pm, Spring 2018\n");
		
		//define the input handler
		Scanner input = new Scanner(System.in);
		
		//input the total price
		System.out.print("Please input the total price: ");
		double totalPrice = input.nextDouble();
		
		//input the total square feet
		System.out.print("Please input the total square feet: ");
		double totalSqf = input.nextDouble();
		
		// call the method to do the calculation and received the return result
		double pricePerSqf = calcPricePerSqf(totalPrice, totalSqf);
		
		//output the result
		System.out.printf("The price per square foot of the house is: $%.2f", pricePerSqf);
		
		//close the scanner
		input.close();
	}

	//method definition, to be invoked by main
	public static double calcPricePerSqf(double price, double sqf){
		//define the local variable to store the calculation result
		double pricePerSqf = price / sqf;
		
		//return the result
		return pricePerSqf;
	}
	
}
