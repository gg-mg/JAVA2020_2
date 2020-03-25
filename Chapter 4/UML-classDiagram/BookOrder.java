/** Program header:  BookOrder.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class defines a BookOrder class with components:
 *     book title, unit price, number of books ordered, and order date.
 *   It also provide public method to calculate total price and sale price, 
 *     in addition to the regular getters and setters of the data members.
 */
 
import java.util.Date;

public class BookOrder {
  /** a list of private data members goes here */
  private String bookTitle;
  private double unitPrice;
  private int numberOfBooks;
  private Date orderDate;

  /** constructors go here */
  /** Default constructor has no formal parameters */
  public BookOrder() {
    this("Romeo and Juliet", 7.95, 2);
  }

  /** Constructor with formal parameters: title, unit price, and number ordered */
  public BookOrder(String bookTitle, double unitPrice, int numberOfBooks) { 
    this.bookTitle = bookTitle;   // We have to put this.bookTitle here to distinguish duplicate names, 
    this.unitPrice = unitPrice;   //  because formal parameter bookTitle defined in line 29 has the same name  
    this.numberOfBooks = numberOfBooks;  // as the private data bookTitle defined in line 17.
    orderDate = new Date();  // We don't need to put this.orderDate here, because for private data OrderDate defined
  }                          //   in line 20, there is no formal parameter called orderDate defined in line 29.

  /** getters go here */ 
  /** Return the title */
  public String getBookTitle() {
    return bookTitle;
  }

  /** Return the unit price */
  public double getUnitPrice() {
    return unitPrice;
  }

  /** Return number of books */
  public int getNumberOfBooks() {
    return numberOfBooks;
  }

  /** Return the order date */
  public Date getOrderDate() {
    return orderDate;
  }

  /** setters go here */  
  /** Set a new title */
  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  /** Set a new unit price */
  public void setUnitPrice(double unitPrice) {  // if the formal parameter has the name price, then line 65 
    this.unitPrice = unitPrice;					// can be changed to: unitPrice = price; 
  }												// , and no need to use java keyword this.unitPrice
  
  /** Set a new number */
  public void setNumberOfBooks(int numberOfBooks) {
    this.numberOfBooks = numberOfBooks;
  }

  /** effectors go here */ 
  /** Calculate total price */     // This method does not need formal parameter, because it can access all its 
  public double calcTotalPrice() {  //  private data already. Adding formal parameter here is duplicate and wrong.
    double totalPrice = unitPrice * numberOfBooks; // no need to call method getUnitPrice() or getNumberOfBooks() ,
    return totalPrice;    						// because private data can be access directly in the same class.
  } // in line 76, we don't need to call getters, such as: double totalPrice = getUnitPrice() * getNumberOfBooks(); 
    // because within the same class, method calcTotalPrice() have direct access to the private data members.
  /** Calculate sale price at a given discount rate*/ // this method needs the formal parameter, because variable 
  public double calcSalePrice(double discountRate) {  //  discountRate is not a private data member of class BookOrder.
    double salePrice = calcTotalPrice() * (1 - discountRate/100);
    return salePrice;    
  }

}
