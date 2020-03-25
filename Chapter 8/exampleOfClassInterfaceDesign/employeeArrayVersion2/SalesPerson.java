/** Program header:  SalesPerson.java
 *
 * Author:    John Doe
 * Class:     Java Online
 *
 * Brief Program Description:
 *   This class extends from class Employee, and implements interface Payable. 
 *   It has concrete implementations for all inherited abstract methods from interface Payable, 
 *     thus this class does not need to be defined as abstract. 
 *   It defines three private data fields: base salary, commission rate, and sales.
 *   It also provides a default constructor and a constructor with five parameters,  
 *     in addition to the regular getters and setters for all private data members.
 *   The effector is to calculate the take-home income after tax and insurance.
 *   It also provide its own version of toString() method.
 */
 
public class SalesPerson extends Employee implements Payable
{
	/** data variables */
	private double baseSalary;      
	private double commissionRate;  
	private double sales; 
   
	/** constructors */
	public SalesPerson() { 
		super(); 
	}
	
	public SalesPerson(String firstName, String lastName, double baseSalary, double commissionRate, double sales) {
		super(firstName, lastName);  
		this.baseSalary = baseSalary;
		this.commissionRate = commissionRate;
		this.sales = sales;
	}
   
	/** getters */
	public double getbaseSalary() {
		return baseSalary; 
	}
	
	public double getCommissionRate() { 
		return commissionRate; 
	}

	public double getSales() { 
		return sales; 
	}
   
	/** setters */
	public void setbaseSalary(double baseSalary){
		this.baseSalary = baseSalary; 
	}
	
	public void setCommissionRate(double commissionRate){ 
		this.commissionRate = commissionRate; 
	}

	public void setSales(double sales){ 
		this.sales = sales; 
	}

  	/** effectors */
	public double calcSalary(){ 
		return baseSalary + (commissionRate * sales); 
	}
   
	public double calcTakeHome() {
		double salary = calcSalary();
		double takeHome = salary;
   	 
		takeHome -= salary * Payable.FED_TAX_RATE;
		takeHome -= salary * Payable.STATE_TAX_RATE;
		takeHome -= salary * Payable.FICA;
		takeHome -= Payable.INSURANCE_PREMIUM;
	 
		return takeHome;
	} 
	
	public String toString() {
		String fromParent = super.toString(); // get the info of the inherited data from superclass.
		String myOwnMessage = String.format (", a sales person with base salary %8.2f, commission rate %5.2f, sales %8.2f", 
			baseSalary, commissionRate, sales); // get the info of its own class
		return fromParent + myOwnMessage; // return the concatenated messages
	}

} //end of SalesPerson class  
   