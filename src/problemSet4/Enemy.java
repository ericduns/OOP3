package problemSet4;

/**
 * @(#)Enemy.java
 *
 *
 * @author 
 * @version 1.00 2014/1/19
 */


public interface Enemy {
    void setLives(int a);
    int getLives();
    void weaponCount(int w);
    int getWeapon();
}