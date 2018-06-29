package username;
import com.bridgelabz.utility.*;
public class Coupon 
{
 public static void main(String args []) 
 {
	 Utility u=new Utility();
	 int number;
	 System.out.println("Enter the number");
	 number=u.getnumber();
	  int answer = u.generatecoupon(number);
	 System.out.println("the coupon numbers can generated are="+answer);
 }
}
