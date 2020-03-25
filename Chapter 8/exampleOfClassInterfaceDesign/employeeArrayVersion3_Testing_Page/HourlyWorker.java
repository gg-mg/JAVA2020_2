/** Program header:  HourlyWorker.java
 *
 * Author:    John Doe
 * Class:     Java Online
 *
 * Brief Program Description:
 *   This class extends from class Employee, and implements interface Payable. 
 *   It has concrete implementations for all inherited abstract methods from interface Payable, 
 *     thus this class does not need to be defined as abstract. 
 *   It defines two private data fields: hours and rate.
 *   It also provides a default constructor and a constructor with four parameters,  
 *     in addition to the regular getters and setters for all private data members.
 *   The effector is use to calculate the take-home income after tax.
 *   It also provide its own version of toString() method.
 */
	
public class HourlyWorker extends Employee implements Payable
{
	/** data variables */
	private int hours;  
	private double rate;   
 
	/** constructors */
	public HourlyWorker() { 
		super(); 
	}
   
	public HourlyWorker(String firstName, String lastName, int hours, double rate) {
		super(firstName, lastName);   
		setHours(hours); // we call method setHours here, because we need the logic in line 45 in method setHours.
		this.rate = rate;
	}   

	/** getters */
	public int getHours() { 
		return hours; 
	}

	public double getRate() { 
		return rate; 
	}
	
	/** setters */
	public void setHours(int hours) { 
		this.hours = (hours>=0 && hours<168 ? hours : 0);  //Use of ternary operator
	}
	
	public void setRate(double rate) { 
		this.rate = rate; 
	}

	/** effectors */
	public double calcSalary() { 
		return hours * rate; 
	}
  
	public double calcTakeHome() {
		double salary = calcSalary();
		double takeHome = salary;
   	 
		takeHome -= salary * Payable.FED_TAX_RATE;
		takeHome -= salary * Payable.STATE_TAX_RATE;
		takeHome -= salary * Payable.FICA;

		return takeHome;
	}

	public String toString() {
		String fromParent = super.toString(); // get the info of the inherited data from superclass.
		String myOwnMessage = String.format (", a hourly worker with hourly rate %8.2f, hours worked %5d", 
			rate, hours); // get the info of its own class
		return fromParent + myOwnMessage; // return the concatenated messages	 
	}
	
}//end of HourlyWorker class
   
   
   