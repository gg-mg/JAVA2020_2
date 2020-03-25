/** 
*  This class is to be used by class PassingParameterExampleForObject,  
*  to create instances (objects) of class Student.
*/
public class Student{ 

	private String name;
	private double gpa;
	
	/** default constructor */
	public Student(){}
	
	/** constructor with parameters */
	public Student(String name, double gpa){
		this.name = name;
		this.gpa = gpa;
	}
	
	/** setters */
	public void setName(String name){
		this.name = name;
	}
	
	public void setGpa(double gpa){
		this.gpa = gpa;
	}
	
	/** getters */
	public String getName(){
		return name;
	}
	
	public double getGpa(){
		return gpa;
	}
}