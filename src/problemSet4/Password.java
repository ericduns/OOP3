package problemSet4;

import javax.swing.*;
/**
 * @(#)Password.java
 *
 *
 * @author 
 * @version 1.00 2014/1/24
 */

public class Password {
        private static int number,upperCase,lowerCase;
        private static boolean valid,test;
    /**
     * Creates a new instance of <code>Password</code>.
     */
    public Password() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       while(test != true){
        String password = "E12";//JOptionPane.showInputDialog("Enter your password");
        
   
        test = isValid(password);
        JOptionPane.showMessageDialog(null,test);
        }
    }
    public static boolean isValid(String pass){
      	
        	for(int i =0 ;i < pass.length();i++){
        		if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z'){
        			upperCase++;
        		}
        		else if(pass.charAt(i) >= 'a' || pass.charAt(i) <= 'z'){
        			lowerCase++;
        		}
        		else if(pass.charAt(i) >= '1' || pass.charAt(i) <= '9'){
        			number++;
        		}
        		if( pass.length() >=8 && upperCase >= 1 && lowerCase >= 1  && number >= 1){
        			valid = true;
        		}
        		else {
        			valid = false;
        		}
        	}  	 
        		
        	return valid;
        	
    }
   
}
