package problemSet2;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class PackmanPlayer extends Player{

        private int life = 3;
        public PackmanPlayer(){
                this("No Name ", 0);
        }
        public PackmanPlayer(String name,int score){
                setName(name);
                setScore(score);
        }
        public void setLives(int life)
        {
                this.life = life;
        }
        public int loseALife(){
                life--;
                return life;
        }
        public int getLives(){
                return life;
        }
        public String isDead(){
                if(life < 0)
                {
                        return "\n0 Lives Left";
                }
                else{
                        return "Is alive\n";
                }
        }
        public String toString(){
                
                return super.toString() + "\nVital signs "+isDead();
        }
}