package problemSet8;

import java.util.Comparator;


public class Player {

	private String name;
	private int score;

	public Player()
	{
		name = "No Name";
		score = 0;
	}
	public Player(String name,int score)
	{
		setName(name);
		setScore(score);
	}
	public void setName(String pName)
	{
		name = pName;
	}
	public void setScore(int pScore)
	{
		score = pScore;
	}
	public String getName(){return name;}
	public int getScore(){return score;}

	public String toString()
	{
		return " Players name is " + getName() + " player Score is " + getScore();
	}


}