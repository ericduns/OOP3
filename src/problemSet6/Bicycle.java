package problemSet6;

import java.io.*;
import java.util.Comparator;
/** models a bicycle
 */
public class Bicycle  implements Comparable{
	
	private String owner;
	private double value;
	private String make;
	
	/** owner and value known
	 *@param s The owner's name
	 *@param v the bicycle's value
	 */
	public  Bicycle( String s, double v ){
		owner = s;
		make = "unknown make";
		value = v;
	}
	
	/** Owner known, but not the make or value
	 *@param s the owner's full name
	 */
	public  Bicycle( String s ){
		owner = s;
		make = "unknown make";
	}
	
	public  Bicycle( ){
		owner = "unassigned";
		make = "unknown make";
	}
	
	public void setOwner(String s){
		owner = s;
	}
	
	public void setMake(String m){
		make = m;
	}
	
	public void setValue(double v){
		value = v;
	}
	
	public String getOwner(){
	  return owner;	
	}
	
	public String getMake(){
	  return make;	
	}
	
	public double getValue(){
	  return value;	
	}
	
	/**
	 *@return owner's name, make and value separatred by one space */
	public String toString() {
		return owner + "\n " + make + " \n" + value + "\n";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}