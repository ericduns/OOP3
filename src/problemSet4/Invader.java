package problemSet4;

/**
 * @(#)Invader.java
 *
 *
 * @author 
 * @version 1.00 2014/1/19
 */


public abstract class Invader implements Enemy{
    	
    abstract void setEnemy(String s);
    abstract String getEnemy();
    abstract void setAmmo(int a);
    abstract int getAmmo();	
}