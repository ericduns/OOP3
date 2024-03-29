package problemSet9;

import javax.swing.*;
/** catches NumberFormatException and forces user to re-enter
 *@author Aoileann
 */
public class AgeInput3 {
  public static void main (String args[]){
        String inputStr;
        int    age;
		boolean valid = false;
		
        do {

            inputStr  = JOptionPane.showInputDialog(null, "Please enter your age:");

            try {
                age = Integer.parseInt(inputStr);
                JOptionPane.showMessageDialog(null,"Your age is " + age);
                valid = true;
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n"
                                            + "Please enter digits only");
            } // end catch
            finally
            {
            	if(valid == true)
            	JOptionPane.showMessageDialog(null,"Have a nice day");
            }
        } while (!valid);
		
    }

}