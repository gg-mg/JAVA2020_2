/**
* This example corresponds to Figure 3 in file "MemoryManagementForObject.docx".
* Figure 3 is to explain the difference between primitive data type (such as int)
*   and a class data type (such as class Student), when they are stored in memory.
*/

public class StackHeapExampleForObject{
	public static void main(String[] args){
		// a primitive type variable holds the data in the stack
		int myIntVar = 10;  
		
		// an object does not hold the data in the stack, instead,
		// the object variable is a reference variable that holds
		// an address (a reference) pointing to a block of memory
		// in the heap, and the body (data) of the object is stored 
		// in the memory block in the heap. 
		Student studentA = new Student("Mike", 3.85);
		
		// the rest of the method is omitted
	}
}

