//ArrayListDemo.java shows ArrayList as a generic class type, also a static binding example.

import java.util.ArrayList;

public class ArrayListDemo
{
	static public void main(String[] args)
	{
		ArrayList<BankAccount> aList = new ArrayList<BankAccount>();
		ArrayList<Integer> bList = new ArrayList<Integer>();

		System.out.printf("aList size after instantiation: %2d\n\n", aList.size());
		System.out.printf("bList size after instantiation: %2d\n\n", bList.size());

		for(int x=0; x<15; x++)  //the incremental argument is empty.
		{
			aList.add(new BankAccount(x, (x+1)*10.0));
			bList.add(new Integer(x));
			
			/** 
			The following two lines of statements won't compile, because the element types of ArrayList objects, 
			   BankAccount and Integer, do not match in compile time, so they need to be commented out.
			We can see that ArrayList, as an example of generic programming, is a form of 
			   static binding.
			*/ 	
			//bList.add(new BankAccount(x, (x+1)*10.0));
			//aList.add(new Integer(x));
		}

		System.out.printf("Display array (using traditional for loop):\n");
		for(int x=0; x<aList.size(); x++)
		{
			BankAccount oneAccnt = aList.get(x);
			//System.out.printf("Customer%5d $%7.2f\n", oneAccnt.getAcctNum(), oneAccnt.getBalance());
			System.out.printf("Customer%s", oneAccnt);  // this line's output is the same as the above line
		}
		System.out.printf("List size: %2d\n\n", aList.size());	

	    aList.remove(2); //remove element at specific position

		System.out.printf(
			"After removing element at index 2, list size: %2d\n", aList.size());	
		System.out.printf(
			"After removing element at index 2, display array :(using for-each loop)\n");

		for(BankAccount iterator : aList)
		{
			System.out.printf("Customer%s", iterator);
		}
		System.out.println();
	}//end of main method
} //end of ArrayListBankAccountDemo class
