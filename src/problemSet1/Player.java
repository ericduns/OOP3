package problemSet1;

/** models a game player, with name and score*/

import java.io.*;

public class Player implements Serializable{
  private String name;
  private int score;
  private boolean online,offLine;  
  /** default player has attributes "Name Unknown" and score 0 */
  public Player() {
   	this("name unknown",0);
  }
  
  public Player(String name){
  	this(name,0);
  }
  
  /** all attributes known
   *@param name Full Name
   *@param score Score
   */
  public Player(String name, int score){
  	setName(name);
  	setScore(score);
  }
  
  /** returns the player's full name */
  public String getName(){
  	return name;
  }
  
  /** returns the player's current score */
  public int getScore() {
  	return score;
  }
  
  public void setName(String name){
  	this.name = name;
  }
  
  /** changes the score
   *@param score The new score, should be >= 0
   */
  public void setScore(int score){
  	if (score >=0)
  		this.score = score;
  }
  public void setOnline(boolean online){
  	
  	this.online = online;
  }
  public boolean getOnline()
  {
  	if(online ==true )
  	{
  	  return true;	
  	}
  	else
  	{
  		return false;
  	}
  }
  /** 
   *@return all attributes on one line separated by spaces */
  public String toString(){
  	
  	String text="";
  	if(getOnline())
  	{
  		text+= "Online";
  	}
  	else
  	{
  		text += "Offline";
  	}
  	return "The players name is " + getName() + "\nThe number of goals scored is "
  		 + getScore()+"\n The player is "+text+"\n\n";
  }
    
    
}