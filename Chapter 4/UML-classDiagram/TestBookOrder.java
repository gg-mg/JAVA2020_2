/** Program header:  TestBookOrder.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class is the application class with the main method.
 *   It asks for user input parameters to initialize book orders.
 *   Then it creates two objects using two different constructors, respectively. 
 *   For the object created with default object, it uses setters to customize various object data.  
 *   Then it calculates and output the object characteristics such as date and price.
 */
 
import java.util.Scanner;

public class TestBookOrder {
  /** the main method is where Java program starts executing */
  public static void main(String[] args) {
    // Create a Scanner, associated with the standard system input device, which is the keyboard.
    Scanner input = new Scanner(System.in);

    // Enter book title
    System.out.print("Enter my book title, for example, The Wealth of Nations: ");
    String title = input.nextLine();

    // Enter unit price
    System.out.print("Enter unit book price, for example, 12.55: ");
    double price =  input.nextDouble();

    // Enter number of books in the order
    System.out.print("Enter number of books ordered: ");
    int numberOrdered = input.nextInt();

    // Create a BookOrder object using the constructor with all parameters
    BookOrder myOrder = new BookOrder(title, price, numberOrdered);

    // Display some information about the object
    System.out.printf("The book %s was ordered on %s, and the total price is %.2f\n", 
	  myOrder.getBookTitle(), myOrder.getOrderDate(), myOrder.calcTotalPrice() );
	
	// Enter the discount percentage
    System.out.print("Enter the percentage of discount, for example, 5: ");
    double discountPercent = input.nextDouble();
     
    System.out.printf("The book order's sale price is : %.2f, after a %.1f percent discount\n", 
	  myOrder.calcSalePrice(discountPercent) , discountPercent );
	System.out.println("done with my book order");
	System.out.print("\n\n"); // output two empty lines here.
	
    // Create a BookOrder object using the constructor with no parameters, i.e., the default constructor
    BookOrder hisOrder = new BookOrder();  // create an object now, and will customize its data later using setters.

    // Enter book title
	input.nextLine();  // this statement is to clear any inputs from the previous input statement.
    System.out.print("Enter his book title, for example, The Wealth of Nations: ");
    String hisBooktitle = input.nextLine();

    // Enter unit price
    System.out.print("Enter unit book price, for example, 12.55: ");
    double hisBookPrice =  input.nextDouble();

    // Enter number of books in the order
    System.out.print("Enter number of books ordered: ");
    int hisNumber = input.nextInt();
	
	hisOrder.setBookTitle(hisBooktitle); // customize the book title for hisOrder
	hisOrder.setUnitPrice(hisBookPrice); // customize the unit price for hisOrder
	hisOrder.setNumberOfBooks(hisNumber);// customize the number of books for hisOrder

    // Display some information about the object
    System.out.printf("His book %s was ordered on %s, and the total price is %.2f\n", 
	  hisOrder.getBookTitle(), hisOrder.getOrderDate(), hisOrder.calcTotalPrice() );
	
	// Enter the discount percentage
    System.out.print("Enter the percentage of discount, for example, 5: ");
    double hisDiscount = input.nextDouble();

    System.out.printf("His book order's sale price is : %.2f, after a %.1f percent discount\n", 
	  hisOrder.calcSalePrice(hisDiscount) , hisDiscount );
	System.out.print("done with his book order\n");
	System.out.print("\n\n"); // output two empty lines here.	
	
	//System.out.println( myOrder.unitPrice );
	/** The line above does not compile, because it violates the encapsulation 
	 *    principle by attempting to access a private data member directly.
	 *  The correct way is to access private data member via its public getter:
	 *	  myOrder.getUnitPrice();
	 *  Please try this: uncomment line 83 and try to compile it, and you will 
	 *    see the compilation error message as:
	 *	      the field unitPrice has private access in BookOrder
	 *	Explanation: a private field in class BookOrder if not visible by any other 
	 *	  class, such as this class TestBookOrder.
	 *  The solution is to replace the direct access of private data with
	 *	  a public method (which is visible by any other class), as stated above in line 87. 
	*/
  }
}
