/** Program header:  PayrollArrayDemo.java
 *
 * Author:    John Doe
 * Class:     Java Online
 *
 * Brief Program Description:
 *   This class is the application class that has the main method.
 *   It creates an array of superclass type, then initialize it with objects of different subclass types.
 *   It follows the class-interface design in version 3, and the array cannot be navigated with dynamic binding, 
 *		and we need to know the exact subclass type of each array element, via the use of java keyword instanceOf. 
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
   	 	list[0] = new HourlyWorker("Harrison","Ford", 20, 10.45);
		list[1] = new SalesPerson("Brad","Pitt", 1500.0, .03, 150.00);
    	list[2] = new HourlyWorker("Sandra","Bullock", 40, 13.75);
   	 	list[3] = new SalesPerson("Robin","Williams", 1000, .055, 800.00);

		/** inside the loop below, with (line 41) or without (line 47) the explicit calling of method toString() 
			by object list[i], it will be the same, because any object will call toString() automatically 
			if this object is an output item of method printf, or println, or print.
		*/
	   	for(int i=0; i<list.length; i++){
			if(list[i] instanceof SalesPerson){
				System.out.printf("%s, earned $%6.2f\n", list[i].toString(), 
					((SalesPerson)list[i]).calcSalary());			
				System.out.printf("%s, can take home $%6.2f\n", list[i], 
					((SalesPerson)list[i]).calcTakeHome());
			}
			else if(list[i] instanceof HourlyWorker){
				System.out.printf("%s, earned $%6.2f\n", list[i].toString(), 
					((HourlyWorker)list[i]).calcSalary());			
				System.out.printf("%s, can take home $%6.2f\n", list[i], 
					((HourlyWorker)list[i]).calcTakeHome());
			}
		}/**In this version, there is no prototype for these two methods: calcSalary() and 
		  and calcTakeHome() in superclass Employee, so we can not invoke
		  these two methods directly from superclass references list[i].
		  We need to convert the superclass reference to child class first,
		  before we can invoke these two methods from the list[i].
		 */
		 
		double sumOfSalaries = calcTotalSalary(list);	
		System.out.printf("the sum of everyone's salary are: $%8.2f \n", sumOfSalaries); 

		double sumOfTakeHome = calcTotalTakeHome(list);	
		System.out.printf("the sum of everyone's take home are: $%8.2f \n", sumOfTakeHome); 
	}
	
	public static double calcTotalSalary(Employee[] payroll){
		
		double totalSalary = 0;
		for(Employee eachPerson : payroll){
		    if(eachPerson instanceof SalesPerson){
				totalSalary += ((SalesPerson)eachPerson).calcSalary();
			}
			else if (eachPerson instanceof HourlyWorker){
				totalSalary += ((HourlyWorker)eachPerson).calcSalary();
			}
		}
		return totalSalary;
	}

	public static double calcTotalTakeHome(Employee[] payroll){
		
		double totalTakeHome = 0;
		for(int i = 0; i < payroll.length; i++){
		    if(payroll[i] instanceof SalesPerson){
				totalTakeHome += ((SalesPerson)payroll[i]).calcTakeHome();
			}
			else if (payroll[i] instanceof HourlyWorker){
				totalTakeHome += ((HourlyWorker)payroll[i]).calcTakeHome();
			}
		}
		return totalTakeHome;
	}
	
} //end of PayrollArrayDemo class