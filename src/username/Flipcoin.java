package username;
import com.bridgelabz.utility.*;
public class Flipcoin 
{

  public static void main(String[] args) 
	{ 
    int number;
    Utility u=new Utility();
    System.out.println("Enter the number");
    number=u.getnumber();
    u.flipcoin(number);
    }
}