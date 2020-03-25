// application class that makes use of the Pet family
import java.util.Scanner;

public class TestPet {
  public static void main(String[] args) {
    
	Pet myPet; // declare a superclass reference variable.
	
	Scanner input = new Scanner(System.in);
	System.out.print(
	  "Which pet do you want to have(0 for cat; 1 for dog ): ");
		
	int choice = input.nextInt();
	if( choice == 0){
	  myPet = new Cat("yellow", 3, "Persian"); // a 3-year-old yellow Persian cat; 
	}
	else {
	  myPet = new Dog("brown", 5, "German Shepherd"); // a 5-year-old brown German Shepherd.
	}
	// The parameters we plug in at line 15 and 18 are hard-coded, just to simplify the program. 
	// As an alternative, the program can ask for user's input of the pets' information, 
	//    such as color, year-old, and breed.
	
    System.out.printf("The pet's equivalent human age is %4d\n", myPet.calcHumanAge() );
	//The above line is a good example of dynamic binding:
	// since variable myPet may refer to a Cat or a Dog object, 
	// thus which version of the method calcHumanAge() to invoke is determined 
	// at runtime (dynamic binding), not at compiling time (static binding).
	// Especially in this example, it is impossible for the compiler to determine  
	// which version of calcHumanAge() method to invoke at compiling time.
	// Another way to look at this issue is: the class type of the reference 
	// variable myPet is Pet, and this class type does not help
	// in determining which method version to invoke; and it is the type of the
	// object being pointed to, either a Cat object or a Dog object, 
	// that determines which version of the method calcHumanAge() to invoke.
	
	// The statement above in line 24 is also a good example of parent object pointing to child object: 
	//  the parent reference variable myPet points (references) to a child (subclass) object: 
	//  either a Cat object, or a Dog object. 
	
  }

}
