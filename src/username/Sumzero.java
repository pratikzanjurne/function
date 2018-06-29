package username;
import com.bridgelabz.utility.*;
public class Sumzero {
public static void main(String[] args) 
	{
		
		Utility u =new Utility();
	    System.out.println("Enter size of array");
	   	int n=u.getnumber();
	    int Array[]=u.getArray(n);
	    u.checksumzero(Array,n);

	}

}
