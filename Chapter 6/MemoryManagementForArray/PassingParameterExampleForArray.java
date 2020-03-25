/**
*This example corresponds to Figure 4 in file "MemoryManagementForArray.docx".
* Figure 4 is to explain the difference between passing a primitive data type  
*  (such as int) and passing an array, as parameter for a method.
*/

public class PassingParameterExampleForArray{
	public static void main(String[] args){
		int myIntVar = 10;
		double[] scores = new double[3];  // declaration and creation of array
		scores[0] = 301.59; // now is the initialization of the array.
		scores[1] = 72.6;
		scores[2] = 196.68;
		
		System.out.println("in main, before processing:");
		System.out.printf("myIntVar:%5d;   array: %6.2f %6.2f %6.2f\n\n", 
			myIntVar, scores[0], scores[1], scores[2]);
		
		process(myIntVar, scores);
		
		System.out.println("in main, after processing:");
		System.out.printf("myIntVar:%5d;   array: %6.2f %6.2f %6.2f\n\n", 
			myIntVar, scores[0], scores[1], scores[2]);
	}

	public static void process(int myInt, double[] list){
		myInt = 20;  // change the value of parameter of built-in data type
		for(int i=0; i<list.length; i++){  
			list[i] = list[i]/2; // change the array content
		}
		
		System.out.println("inside processing:");
		System.out.printf("myIntVar:%5d;   array: ", myInt);
		for(int i=0; i<list.length; i++){
			System.out.printf("%6.2f ", list[i]);
		}
		System.out.print("\n\n");
	}
}
