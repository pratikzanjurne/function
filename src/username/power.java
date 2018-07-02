package username;
import com.bridgelabz.utility.*;
public class power 
{
	public static void main(String args[])
	{
		int number;
		Utility u=new Utility();
		System.out.println("Enter number less than 31");
		number=u.getnumber();
		if(number<31)
		{
			u.power(number);	
		}
		else
		{
			System.out.println("Enter number less than 31");
		}
		
		
	}
}
