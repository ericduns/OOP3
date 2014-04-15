package problemSet1;
/**
 * @(#)BadGuy.java
 *
 *
 * @author 
 * @version 1.00 2013/12/4
 */
import javax.swing.*;

public class GoodBad {
	
	private int ammo;
	private int strength;
	private String name;
	private boolean isAlive;
  
  	public GoodBad(){}
  	
    public GoodBad(String name,int ammo,int strength) 
    {
    	this.name = name;
    	this.ammo = ammo;
    	this.strength = strength;
    	this.isAlive = isAlive;
    }
    	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAmmo(int ammo)
	{
		this.ammo = ammo;
	}
	public void setStrength(int strength)
	{
		this.strength = strength;
	}
	public void aliveStatus(boolean isAlive)
	{
		this.isAlive = isAlive;
	}
	public String getName()
	{
	    return name;
	}
	public int getAmmo()
	{
		return ammo--;
	}
	public int getStrength()
	{	
		return strength--;
	}
	public boolean getAlive()
	{
		if(isAlive == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		String status = "";
		
		if(getAlive())
		{
			status += "Alive";
		}
		else
		{
			status+="Dead";
		}
		return "Name "+getName() + "\nStrength " + getStrength() + 
			   "\nAmmo Status " + getAmmo() + "\nVital Signs " + status;
	}
	
	
}
