package problemSet1;

/*Setting up and displaying two player objects a bank account for 
*each of the and one person object
*/
 
import javax.swing.*;

public class Players{
	
	public static void main(String [] args)
	{
		Player player1,player2;
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		Person person;
	
		player1 = new Player("Paul Smith",21);
		player1.setOnline(true);
		acc1.setAccNum("23456789");
		acc1.lodge(3456);
		
		player2 = new Player("Alan Jones",23);
		player2.setOnline(false);
		acc2.setAccNum("224675467");
		acc2.lodge(6578);
		person = new Person("Sean O Connor",23,'m');
		
		JOptionPane.showMessageDialog(null,player1+"\n"+player1.getName()+"Your bank account number is "+
			acc1.getAccNum()+"\n"+"Your account balance is: "+acc1.getBalance()+"\n\n"+	player2+ "\n"+
			player2.getName()+ " Your Bank Account number is "+"\nYour account balance is: "+ acc2.getAccNum()+
			"\n"+acc2.getBalance()+"\n\n "+person);
		
	}
}
