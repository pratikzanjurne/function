package username;

import com.bridgelabz.utility.Utility;

public class Array2D {

public static void main(String args[])
{
	int a,b;
	Utility u= new Utility();
	System.out.println("Enter the number of ROWS in Array");
	a=u.getnumber();
	System.out.println("Enter the number of COL in Array");
	b=u.getnumber();
	u.take2darray(a, b);
	
	
}

}
