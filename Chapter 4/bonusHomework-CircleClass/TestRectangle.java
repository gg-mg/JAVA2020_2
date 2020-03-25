/** Program header:  TestRectangle.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class is the application class with the main method.
 *   It asks for user input parameters to initialize objects of Rectangle type.
 *   Then it creates two objects using two different constructors, respectively. 
 *   For the object created with default object, it uses setters to customize various object data.  
 *   Then it calculates and output the object characteristics such as area and cost.
 */
 
import java.util.Scanner;

public class TestRectangle {
	/** the main method is where Java program starts executing */
	public static void main(String[] args) {
		// Create a Scanner, associated with the standard system input device, which is the keyboard.
		Scanner input = new Scanner(System.in);

		// Enter length
		System.out.print("Enter my rectangle's length, for example, 3.2: ");
		double myLength = input.nextDouble();

		// Enter width
		System.out.print("Enter my rectangle's width, for example, 1.5: ");
		double myWidth = input.nextDouble();

		// Create a Rectangle object using the constructor with all parameters
		Rectangle myRectangle = new Rectangle(myLength, myWidth);

		// Display some information about the object
		System.out.printf("My rectangle has a dimension of %6.1f by %6.1f (length by width)\n", 
			myRectangle.getLength(), myRectangle.getWidth());
	
		System.out.printf("My rectangle's area is %6.1f, and its perimeter is %6.1f\n", 
			myRectangle.calculateArea(),  myRectangle.calculatePerimeter() );

		// Enter the cost per unit area 
		System.out.print("Enter the cost per unit area, for example, 2.4: ");
		double myUnitCost = input.nextDouble();
     
		// calculate and output the total cost 
		System.out.printf("my rectangle's total cost is %6.2f with a per unit area cost of %.2f \n", 
			myRectangle.calculateTotalCost(myUnitCost) , myUnitCost);
		System.out.println("done with my rectangle");
		System.out.print("\n\n"); // output two empty lines here.
	
		// Create a Rectangle object using the constructor with no parameters, i.e., the default constructor
		Rectangle hisRectangle = new Rectangle(); // create an object now, and will customize its data later using setters.

		// Enter length
		System.out.print("Enter his rectangle's length, for example, 3.2: ");
		double hisLength = input.nextDouble();

		// Enter width
		System.out.print("Enter his rectangle's width, for example, 1.5: ");
		double hisWidth = input.nextDouble();

		hisRectangle.setLength(hisLength); // customize length for hisRectangle
		hisRectangle.setWidth(hisWidth);   // customize width for hisRectangle

		// Display some information about the object
		System.out.printf("His rectangle has a dimension of %6.1f by %6.1f (length by width)\n", 
			hisRectangle.getLength(), hisRectangle.getWidth());
	
		System.out.printf("His rectangle's area is %6.1f, and its perimeter is %6.1f\n", 
			hisRectangle.calculateArea(),  hisRectangle.calculatePerimeter() );
	
		// Enter the cost per unit area 
		System.out.print("Enter the cost per unit area, for example, 2.4: ");
		double hisUnitCost = input.nextDouble();
     
		// calculate and output the total cost 
		System.out.printf("his rectangle's total cost is %6.2f with a per unit area cost of %.2f \n", 
		hisRectangle.calculateTotalCost(hisUnitCost) , hisUnitCost);
		System.out.println("done with his rectangle");
		System.out.print("\n\n"); // output two empty lines here.	
	
	}
}
