/** Program header:  PayrollArrayDemo.java
 *
 * Author:    John Doe
 * Class:     Java Online
 *
 * Brief Program Description:
 *   This class is the application class that has the main method.
 *   It creates an array of superclass type, then initialize it with objects of different subclass types.
 *   It follows the class-interface design in version 1, and the array can be navigated with dynamic binding, 
 *		without having to know the exact subclass type of each array element. 
 *   It calculates and output each array item's characteristics.
 *   It creates methods and passes array as parameters, and it uses for-each loop and regular for loop to 
 *     navigate an array of objects. 
 */

public class PayrollArrayDemo{
	public static void main(String[] args){
		// each array element is of superclass reference type
	   	Employee[] list = new Employee[4]; // this line can be replaced by line 22.
		/** we can also use Payable to define the array, such as the line below:
		    Payable[] list = new Employee[4];
		  and the reason is that: Employee "is-a" Payable through the 
		  inheritance relationship, as defined in the Employee class header.  
		  Java keyword "extends" implies "strong" inheritance relationship, and
		  Java keyword "implements" implies "weak" inheritance relationship, 
		  and no matter weak or strong, they both have the "is-a" 
		  inheritance relationship: subclass "is-a" superclass.
		*/
		// now let the parent reference refers to child class objects.
   	 	list[0] = new HourlyWorker("Harrison", "Ford", 20, 10.45);
		list[1] = new SalesPerson("Brad", "Pitt", 1500.0, .03, 150.00);
    	list[2] = new HourlyWorker("Sandra", "Bullock", 40, 13.75);
   	 	list[3] = new SalesPerson("Robin", "Williams", 1000, .055, 800.00);

		/** inside the loop below, with (line 41) or without (line 43) the explicit calling of method toString() 
			by object list[i], it will be the same, because any object will call toString() automatically 
			if this object is an output item of method printf, or println, or print.
		*/
	   	for(int i=0; i<list.length; i++){
			System.out.printf("%s, earns $%6.2f\n", 
				list[i].toString(), list[i].calcSalary());
			System.out.printf("%s, can take home $%6.2f\n", 
				list[i], list[i].calcTakeHome());
		}/**The fact that which method to invoke (SalesPerson's or HourlyWorker's)
		  is determined by the type of object (HourlyWorker or SalesPerson) being referred to,	 
		  not by the type of the reference, because the reference list[x] has the same superclass type : Employee. 
		  --- This is called Dynamic Binding.
		 */
		
		double sumOfSalaries = calcTotalSalary(list);	
		System.out.printf("the sum of everyone's salary are: $%8.2f \n", sumOfSalaries); 

		double sumOfTakeHome = calcTotalTakeHome(list);	
		System.out.printf("the sum of everyone's take home are: $%8.2f \n", sumOfTakeHome); 
	}
	
	public static double calcTotalSalary(Employee[] payroll){
		
		double totalSalary = 0;
		for(Employee eachPerson : payroll){
			totalSalary += eachPerson.calcSalary();
		}
		return totalSalary;
	}

	public static double calcTotalTakeHome(Employee[] payroll){
		
		double totalTakeHome = 0;
		for(int i = 0; i < payroll.length; i++){
			totalTakeHome += payroll[i].calcTakeHome();
		}
		return totalTakeHome;
	}
	
} //end of PayrollArrayDemo class