package username;

import com.bridgelabz.utility.Utility;

public class Tictactoe extends checkwinner 
{

	public static void main(String[] args) 
	{
		checkwinner ob=new checkwinner();
		boolean x;
		Utility u=new Utility();
        int j=3,i=3;
        int r,c;
        int A[][]=new int[i][j];
	    for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				A[i][j]=0;
			}
		}
	    int l=0;
	    for(int k=0;k<9;k++)
	    {
	    	if(k==0|k==2|k==4|k==6|k==8)
	    	{
	    		System.out.println("Choice of user 2(row then colm)");
	    	    r=u.getnumber();
	    		c=u.getnumber();
	    		A[r][c]=2;
	    		//x=u.checkwinner();
	    		//if(x==true)
	    		{
	    			System.out.println("Player 2 is winner");
	    		}
	    		l++;
	    	}
	    	if(k==1|k==3|k==5|k==7)
	    	{
	    		System.out.println("Choice of user 1(row then colm)");
	    	     r=u.getnumber();
	    		 c=u.getnumber();
	    		A[r][c]=1;
	    		x=ob.check();
	    		if(x==true)
	    		{
	    			System.out.println("Player 1 is winner");
	    		}
	    		l--;
	    	}
	    }
	    for(j=0;j<=2;j++)
		{
			for(i=0;i<=2;i++)
			{
				System.out.print(A[j][i]+" ");
			}
			System.out.println(" ");
		}

		
	}

}
