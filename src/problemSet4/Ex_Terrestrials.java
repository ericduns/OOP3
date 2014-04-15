package problemSet4;

/**
 * @(#)Ex_Terrestrials.java
 *
 *
 * @author 
 * @version 1.00 2014/1/19
 */


public class Ex_Terrestrials extends Invader implements Enemy{

	private String enemy,text,planet;
	private int ammo,ships,weapons;
	private int lives;
	
    public Ex_Terrestrials() {
    }
    public void setEnemy(String s){
    	this.enemy = enemy;
    }
    public String getEnemy(){
    	return enemy;
    }
    public void setAmmo(int a){
    	this.ammo = ammo;
    }
    public int getAmmo(){
    	return ammo;
    }
    public void setLives(int a){
    	this.lives = lives;
    }
    public int getLives(){
    	return lives;
    }
    public boolean getVitals(){
    	if(lives > 0){
    		return true;
    	}
    	else{
    		return false;
    	}
    }
    public void setPlanet(String planet){
    	this.planet = planet;
    }
    public String getPlanet(){
    	return planet;
    }
    public void weaponCount(int w){
    	this.weapons = weapons;
    }
    public int getWeapon(){
    	return weapons;
    }
    public String toString(){
    	
    	if(getVitals()){
    		text += "Good Vitals";
    	}
    	else{
    		text += "Dead";
    	}
    	return String.format("%-20s%s\n%-20s%d\n%-20s%d\n%-20s%d\n%-20s%b\n","Enemy type ",getEnemy(),
    			"Ammo",getAmmo(),"Livel left",getLives(),"Weapons",getWeapon(),"Vital signs",text);
    }
}