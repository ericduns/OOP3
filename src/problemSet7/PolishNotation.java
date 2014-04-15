package problemSet7;

import java.util.*;


public class PolishNotation {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		
		Scanner in = new Scanner(System.in);
		String operator = "";
		Integer num1=0,num2=0,result=0;
		
	try{
				
		do
		{
			System.out.print ("Enter a Number Or Operator ");
			operator = in.nextLine();
			
			if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))
			{
				num2 = st.pop(); 
				num1 = st.pop();
					
			 if(operator.equals("+"))
			 {
				 result = num1 + num2;
			 }
			 
			 else if(operator.equals("-"))
				{						
					result = num1 - num2;
				}
			 	
			 	else if(operator.equals("/"))
			 		{						
			 			result = num1 / num2;
			 		}
			 		
			 		else if(operator.equals("*"))
			 			{
			 				result = num1 * num2;
			 			}
			 			st.push(result);
			}	
			else
			 	{	 
				 	st.push(Integer.parseInt(operator));
			 	}
		}while(!operator.equals("q"));
		
		}
		catch(NumberFormatException e)
			{
				//e.printStackTrace();
			}
			
			System.out.print(st);
	}

}


