/** Program header:  Employee.java
 *
 * Author:    John Doe
 * Class:     Java Online
 *
 * Brief Program Description:
 *   This is the superclass, and it does not inherits from any interface, 
 *     and it does not have dummy implementation of the methods in interface,
 *     so it cannot support dynamic binding in an array of objects in different subclas.
 *   This class defines two private data fields: first and last names
 *   It also provide a default constructor, and a constructor with two parameters,  
 *     in addition to the regular getters and setters for all private data members.
 *   The overridden toString() method is originally defined in class Object, 
 *     and all other classes are either direct subclasses of Object, or more generations 
 *     down from ancestor class Object. 
 *   For Employee class, because it does not explicitly declare its extended superclass , 
 *      class Object is assigned as its superclass by default.
 */
 
public class Employee
{
	/** private data */
	private String firstName;
	private String lastName;
   
	/** constructors */
	public Employee() { 
	}
   
	public Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
   
	/** getters */
	public String getFirstName(){ 
		return firstName; 
	}
	
	public String getLastName(){ 
		return lastName; 
	}

	/** setters */
	public void setFirstName(String firstName){
		this.firstName = firstName; 
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName; 
	}
	
	/**  effectors */
	public String toString() {
		String info = String.format("%8s %8s", firstName, lastName);
		return info;
	}
   
} //end of Employee class