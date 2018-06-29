package username;
import com.bridgelabz.utility.*;
public class Primefactors {

	public static void main(String[] args)
	{
		Utility u = new Utility(); 
		int number;
		System.out.println("Enter your number to check prime factors");
		number = u.getnumber();
		u.primefactors(number);

	}

}
