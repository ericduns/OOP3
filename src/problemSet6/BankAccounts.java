package problemSet6;

import java.util.*;

import javax.swing.JOptionPane;


public class BankAccounts {

	public static void main(String[] args) {
		
		String display = "";
		int i=0;
		
		Set <BankAccount> account = new HashSet<BankAccount>();
		
		
		int choice=0;
		
		while(choice == JOptionPane.YES_OPTION)
		{
		String accNo = JOptionPane.showInputDialog("Enter the account number ");
		double lodge = Double.parseDouble(JOptionPane.showInputDialog("Enter the lodgement ammount"));
		
		BankAccount acc= new BankAccount();
		
		acc.setAccNum(accNo);
		acc.lodge(lodge);
		
		account.add(acc);
		
		choice = JOptionPane.showConfirmDialog(null,"Enter more Accounts");
		i++;
		}
		
		HashSet<BankAccount> account2 = new HashSet<BankAccount>();
		
		account2.addAll(account);
		
		Iterator<BankAccount> it = account.iterator();
		
		while(it.hasNext())
		{
			if(it.next().getBalance() < 100)
    			it.remove();
			
			}
		System.out.println(account);
		
		Iterator<BankAccount> it2 = account2.iterator();
		
		while(it2.hasNext())
		{
			if(it2.next().getBalance() > 100)
    			it2.remove();
			
			}
		System.out.println(account2);
	}

}
