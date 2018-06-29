package username;
import com.bridgelabz.utility.*;
public class Leapyear {

	public static void main(String[] args) 
	{
		int year;
	    Utility u=new Utility();
	    System.out.println("enter the year you want to check");
	    year= u.getnumber();
	    boolean value=u.leapyear(year);
	    if(value==true)
	    {
	    	System.out.println("year is leap year");
	    }
	    else
	    	System.out.println("year is not leap year");

	}

}
																								