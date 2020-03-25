/** Program header:  Fruit.java
 *
 * Author:    John Doe
 * Class:     Java  Online
 *
 * Brief Program Description:
 *   This class defines the private data fields in Fruit class:
 *     the farm it is produced, and whether it is organic or not.
 *   It also provide a default constructor, and a constructor with two parameters,  
 *     in addition to regular getters and setters for all private data members.
 */
 
public class Fruit{

	private String whichFarm;
	private boolean organic;
	
	public Fruit(){
		this("Sunshine Farm", true);
	}

	public Fruit(String whichFarm, boolean organic){
		this.whichFarm = whichFarm;
		this.organic = organic;
	}
	
	public String getWhichFarm(){
		return whichFarm;
	}
	
	public boolean isOrganic(){
		return organic;
	}
	
	public void setWhichFarm(String whichFarm){
		this.whichFarm = whichFarm;
	}

	public void setOrganic(boolean organic){
		this.organic = organic;
	}
	
}