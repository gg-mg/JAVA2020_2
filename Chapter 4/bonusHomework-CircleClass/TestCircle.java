/** Program header:  TestCircle.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class is the application class with the main method.
 *   It asks for user input parameters to initialize objects of Circle type.
 *   Then it creates two objects using two different constructors, respectively. 
 *   For the object created with default object, it uses setters to customize various object data.  
 *   Then it calculates and output the object characteristics such as area and cost.
 */
 
import java.util.Scanner;

public class TestCircle {
	/** the main method is where Java program starts executing */
	public static void main(String[] args) {
		// Create a Scanner, associated with the standard system input device, which is the keyboard.
		Scanner input = new Scanner(System.in);

		// Enter radius
		System.out.print("Enter my circle's radius, for example, 3.2: ");
		double myRadius = input.nextDouble();

		// Create a Circle object using the constructor with all parameters
		Circle myCircle = new Circle(myRadius);

		// Display some information about the object
		System.out.printf("My circle has a radius of %6.1f \n", 
			myCircle.getRadius() );

		System.out.printf("My circle's area is %6.1f, and its perimeter is %6.1f\n", 
			myCircle.calculateArea(),  myCircle.calculatePerimeter() );
	  
		// Enter the cost per square 
		System.out.print("Enter the cost per unit area, for example, 2.4: ");
		double myUnitCost = input.nextDouble();
     
		// calculate and output the total cost 
		System.out.printf("my circle's total cost is %6.2f with a per unit area cost of %.2f \n", 
			myCircle.calculateTotalCost(myUnitCost) , myUnitCost);
		System.out.println("done with my circle");
		System.out.print("\n\n"); // output two empty lines here.
	
		// Create a Circle object using the constructor with no parameters, i.e., the default constructor
		Circle hisCircle = new Circle(); // create an object now, and will customize its data later using setters.

		// Enter radius
		System.out.print("Enter his circle's radius, for example, 3.2: ");
		double hisRadius = input.nextDouble();

		hisCircle.setRadius(hisRadius); // customize the radius for hisCircle

		// Display some information about the object
		System.out.printf("His circle has a radius of %6.1f \n", 
			hisCircle.getRadius() );
	
		System.out.printf("His circle's area is %6.1f, and its perimeter is %6.1f\n", 
			hisCircle.calculateArea(), hisCircle.calculatePerimeter() );
	
		// Enter the cost per square 
		System.out.print("Enter the cost per unit area, for example, 2.4: ");
		double hisUnitCost = input.nextDouble();
     
		// calculate and output the total cost 
		System.out.printf("his circle's total cost is %6.2f with a per square cost of %.2f \n", 
			hisCircle.calculateTotalCost(hisUnitCost) , hisUnitCost);
		System.out.println("done with his circle");
		System.out.print("\n\n"); // output two empty lines here.	
	
	}
}
