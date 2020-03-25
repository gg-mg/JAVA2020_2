//this class BankAccount is used by class ArrayListDemo for ElementType of ArrayList
public class BankAccount
{
    /** data variables */
	private int acctNum;
	private double balance;

	/** constructors */
	public BankAccount() { }		    // default constructor without arguments

	public BankAccount(int n, double b)	//constructor with arguments
	{
		acctNum = n;
		balance = b;
	}

	/** getters/readers/accessors */
	public int getAcctNum()
	{ 
		return acctNum; 
	}
	 
	public double getBalance()
	{
		return balance; 
	}
	 
	/** setters/writers/mutators */
	public void setAcctNum(int n)
	{
		acctNum = n; 
	}
	 
	public void setBalance(double b)
	{
		balance = b;
	}

	/** effectors */
	public void deposit(double amount)
    { 
		balance += amount; 
	}

	public void withdrawal(double amount)
	{
		balance -= amount;
	}

	public String toString()
	{
		String s = String.format("%5d $%7.2f\n", acctNum, balance);
		return s;
	}
}//end of BankAccount class
