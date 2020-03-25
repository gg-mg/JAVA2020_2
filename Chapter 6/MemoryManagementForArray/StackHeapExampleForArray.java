/**
* This example corresponds to Figure 3 in file "MemoryManagementForArray.docx".
* Figure 3 is to explain the difference between primitive data type(such as int)
*   and an array, when they are stored in memory.
*/

public class StackHeapExampleForArray{
	public static void main(String[] args){
		int myIntVar = 10;  // int is one of the 8 primitive (built-in) types
		
		double[] scores = new double[3];  // declaration and creation of array
		scores[0] = 301.59; // now is the initialization of the array.
		scores[1] = 72.6;
		scores[2] = 196.68;
		// the above four lines can be re-written as one line of code below:
		// double[] scores = {301.59, 72.68, 196.68}; 
		//, which follows the same process of declaration, creation, and 
		//  initialization of an array. Even this one of code does not have 
		//  the keywork new, but this one line of code does exactly the same
		//  thing as the four lines of code does.
		
		// the rest of the method is omitted 
	}
}
