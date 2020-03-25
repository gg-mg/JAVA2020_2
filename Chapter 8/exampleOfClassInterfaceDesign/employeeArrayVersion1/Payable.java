/** Program header:  Payable.java
 *
 * Author:    John Doe
 * Class:     Java Online
 *
 * Brief Program Description:
 *   This is the interface, and it has abstract methods to be implemented by it subclass.
 *   It also has some constant variables.
 *   By default, all methods are abstract, and all variables are static final in interface.
 */

public interface Payable
{
	/** all methods are abstract in interface, even without the keyword abstract */
	public double calcSalary();
	public double calcTakeHome();

	/** all data are static final in interface, , even without the keywords static final */
	public double FED_TAX_RATE = 0.0542;
	public double STATE_TAX_RATE = 0.013;
	public double FICA = 0.0025;
	public double INSURANCE_PREMIUM = 250.99;
}//end of Payable interface