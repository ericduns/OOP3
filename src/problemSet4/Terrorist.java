package problemSet4;

/**
 * @(#)Terrorist.java
 *
 *
 * @author 
 * @version 1.00 2014/1/19
 */


public class Terrorist extends Invader implements Enemy{

	private String enemy,text,status;
	private int ammo,weapon;
	private int lives;
	
    public Terrorist() {
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
    public void setStatus(String status){
    	this.status = status;
    }
    public String getStatus(){
    	return status;
    }
    public void weaponCount(int w){
    	this.weapon = weapon;
    }
    public int getWeapon(){
    	return weapon;
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