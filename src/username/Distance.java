package username;

import com.bridgelabz.utility.Utility;

public class Distance 
{
  public static void main(String args[])
  {
	int x,y;
	Utility u=new Utility();
	System.out.println("Enter the value of x");
	x=u.getnumber();
	System.out.println("Enter the value of y");
	y=u.getnumber();
	double answer=u.distance(x,y);
	System.out.println("The distance is = "+answer);
  }
}
