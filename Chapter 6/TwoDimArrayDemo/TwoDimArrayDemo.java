import java.util.*;

public class TwoDimArrayDemo {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // two-dim array declared, with first dimension's size fixed
    int[][] twoDim = new int[4][];  

    System.out.print("please input the 2nd dimension of the 1st element:");
    int size = input.nextInt();
    twoDim[0] = new int[size]; // define the 2nd dimension size of the 1st element.

    // For the sake of simplicity, the next three elements use fixed values
	//   in their second dimensions. Alternatively, they can accept user input
	//   as their dimensions, just like what we did above for the first element. 
    // Because the second dimensions don't have to be the same, two-dimensional array 
	//   is also referred to as ragged array.
    twoDim[1] = new int[4];  // hardcode the second dimension size of the 2nd element.
    twoDim[2] = new int[1];  // hardcode the second dimension size of the 3rd element.
    twoDim[3] = new int[5];  // hardcode the second dimension size of the 4th element.
	
	// it is called ragged array, because in this two-dimensional array,
	// the second dimension are not the same. If we put the array contents
	// in a table, and in this case, this table has 4 rows, because the first dimension is 4.
	// and the column of each row are not the same, thus "ragged".
    for (int i = 0; i < twoDim.length; i++){
      System.out.print("for row " + (i+1) + ", enter " 
	    + twoDim[i].length + " elements : ");	  
      for (int j = 0; j < twoDim[i].length; j++){
        twoDim[i][j] = input.nextInt();
      } // end of inner loop
    } // end of outer loop
	
	printInfo(twoDim);
	
	int total = calcTotal(twoDim);
	System.out.printf("the sum of the array is: %d\n", total);
	
	int totalUsingForEach = calcTotalUsingForEachLoop(twoDim);
	System.out.printf("the sum of the array using for-each is : %d\n", totalUsingForEach);
	
  } // end of main method
  
  public static void printInfo(int[][] list){
    System.out.println("\nthe ragged array you enter is: ");
    for (int i = 0; i < list.length; i++){
      for (int j = 0; j < list[i].length; j++){
        System.out.print(list[i][j] + " ");
      } // end of inner loop
      System.out.println(); // end of output for one row
	} // end of outer loop
  } // end of printInfo method

  public static int calcTotal(int[][] list){
    int sum = 0;
    for (int i = 0; i < list.length; i++){
      for (int j = 0; j < list[i].length; j++){
        sum += list[i][j];
      } // end of inner loop
	} // end of outer loop
	return sum;
  } // end of calcTotal method
  
  // the follow method demonstrates how to use for-each loop in two-dimensional array
  public static int calcTotalUsingForEachLoop(int[][] twoDimArray){
    int sum = 0;
	// We can inteprete : as in in the for each loop, so the next for each line will be intepreted as:
	//   for each one dimensional array in the two dimensional array.
    for (int[] eachOneDimArray : twoDimArray){   
      for (int eachArrayElement : eachOneDimArray){  // for each array element in each one dimensional array
        sum += eachArrayElement;
      } // end of inner loop
	} // end of outer loop
	return sum;
  } // end of calcTotal method
  
} // end of class