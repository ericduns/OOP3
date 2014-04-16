/*
 * Catching any illegal ArithmeticExceptions 
 */
public class IllegalButtonCount extends ArithmeticException{

	public IllegalButtonCount()
	{
		super("Invalid Caracters Entered");
	}
	
	public IllegalButtonCount(String message)
	{
		super(message);
	}
}
