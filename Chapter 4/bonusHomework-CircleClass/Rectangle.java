/** Program header:  Rectangle.java
 *
 * Author:    John Doe
 * Class:     Java Online
 *
 * Brief Program Description:
 *   This sample Rectangle class defines its private data: width and height of a rectangle, 
 *     and a list of public methods including constructors, getters, setters and effectors. 
 *   You should follow the same template to code OOP class with private data and public methods.
 *   The application class that makes use of this Rectangle class is named TestRectangle.
 */

public class Rectangle
{
	/** a list of private data members goes here */
	private double length;
	private double width;
	
	/** constructors go here, with the default constructor leading other constructor(s) */
	public Rectangle(){  // default constructor has no formal parameter
		this(2, 1); 	 // it calls the constructor below that has formal parameters,
						 //   and plus in 2 and 1 as default length and width
	}
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	/** getters for private data members go here. Other name: readers/accessors */
	public double getLength(){
		return length;
	}

	public double getWidth(){
		return width;
	}
	
	/** setters for private data members go here. Other name: writers/mutators */
	public void setLength(double length){
		this.length = length;
	}

	public void setWidth(double width){
		this.width = width;
	}
	
	/** effectors (methods that are not constructor/getter/setter) go here */
	public double calculateArea(){
		double area = length * width;
		return area;
	}
	
	public double calculatePerimeter(){
		double perimeter = 2 * (length + width);
		return perimeter;
	}

	public double calculateTotalCost(double costPerUnit){
		double cost = calculateArea() * costPerUnit;
		return cost;
	}
	

} // end of class
