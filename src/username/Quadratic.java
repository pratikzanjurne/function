package username;

import com.bridgelabz.utility.Utility;

public class Quadratic
{
   public static void main(String args[])
   {
	   int a,b,c;
	   Utility u=new Utility();
	   System.out.println("Enter the value of a");
	   a=u.getnumber();
	   System.out.println("Enter the value of b");
	   b=u.getnumber();
	   System.out.println("Enter the value of c");
	   c=u.getnumber();
	   u.getroots(a,b,c);
   }
}
