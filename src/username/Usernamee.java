package username;

import com.bridgelabz.utility.Utility;

public class Usernamee 
{
   

public static void main(String args[])
   {
	   Utility m=new Utility();
	   String username="<user name>";
	   System.out.println("HEllo "+username+" ,How are you?"); 
	   System.out.println("Enter username");
	   String sc=m.ipstring();
	   String replaced=m.rplcstring(username,sc);
	  System.out.println("Hello "+replaced+" ,How are you?");
   }
}