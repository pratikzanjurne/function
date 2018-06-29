package username;

import com.bridgelabz.utility.Utility;

public class WindChill 
{
	public static void main(String args[])
	{
		int t,v;
		Utility u=new Utility();
		System.out.println("Enter the Tempreture");
		t=u.getnumber();
		System.out.println("Enter the wind speed");
		v=u.getnumber();
		u.windchill(t,v);
	}
}
