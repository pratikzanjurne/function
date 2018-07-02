package com.bridgelabz.utility;
import java.util.*;


public class Utility 
{   
	static Random rand = new Random();
	static Scanner sc=new Scanner(System.in);
	public static String ipstring() 
	{
		return sc.next();
	}
	public static int getnumber()
	{
		return sc.nextInt();
	}
	public static int getrandomInt()
	{
		return rand.nextInt();
	}
	public static double getrandomdouble()
	{
		return rand.nextDouble();
	}
	public static String rplcstring(String username, String sc2) 
	{
		
	    String scv = username.replaceAll(username, sc2);
		
			return scv;
	}
	public static void flipcoin(int number)
	{
		 int headcount=0,tailcount=0;
		 double per1,per2;
		 for(int i=0;i<number;i++)
		 {
		 double val=getrandomdouble();
		 if(val<0.5)
		 {
			 tailcount++;
		 }
		 else
			 headcount++;	
		 }
		 per1=(double)tailcount/number*100;
		 per2=(double)headcount/number*100;
		 System.out.println("Percentage of headount is "+per2);
		 System.out.println("percentage of tailcount is "+per1);
	}
	public static boolean leapyear(int year)
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					return true;
				}
				else
					return false;
			}
			else
			return true;
		}
		else
		return false;
	}
	public void power(int number)
	{
		int power=1;
		for(int i=1;i<=number;i++)
		{
			power=power*2;
			System.out.println("power 2^"+i+" = "+power);
		}
		
	}
	public void harmonic(int number) 
	{
		double answer=0;
		for(int i=1;i<=number;i++)
		{
			answer=answer+1.0/i;
			System.out.print("1/"+i+ " + ");
		}
		System.out.println(" = "+answer);
		System.out.println("Harmonic number of "+number+" is "+answer);
		
	}
	public void primefactors(int number) 
	{
		System.out.println("Prime factors are");
		int factor,n,j;
		for(int i=2;i<=number;i++)
		{
			n=i;
			for(j=2;j<=n;j++)
			{
				if(n%j==0)
				{
					break;
				}
			}
			
			if(j==n);
			{
				if(number%n==0)
				{
					System.out.println(n);
				}
			}
		}
	}
	public int generatecoupon(int number) 
	{
			boolean[] isCollected=new boolean[number];
			int different=0;
			int count=0;
			while(different<number)
			{
				int value=(int)(Math.random()*number);
				count++;
				if(!isCollected[value])
				{
					different++;
					isCollected[value]=true;
				}
			
			}
		return count;
	}
	public int[] getArray(int n)
	{
		int Array[]=new int[n];
		System.out.println("enter your array");
		for(int i=0;i<n;i++)
		{
			
			Array[i]=getnumber();
		}
		return Array;
	}
	public static String[] getstring()
			{
				return null;
		
			}
	public void checksumzero(int Array[],int n)
	{
		int f=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(Array[i]+Array[j]+Array[k]==0)
					{
						System.out.println("Triplet is "+Array[i]+" "+Array[j]+" "+Array[k]);
						f++;
					}
					
						
					
				}
			}
		}
	if(f==0)
	{
		System.out.println("There are no Triplets of this array");
	}
	}
	public void getroots(int a, int b, int c) 
	{
		double delta=(b*b)-(4*a*c);
		int root1=(int) ((-b+Math.sqrt(delta))/2*a);
		int root2=(int) ((-b-Math.sqrt(delta))/2*a);
		System.out.println("Your first root is "+root1);
		System.out.println("Your second root is "+root2);
	}
	public double distance(int x, int y) 
	{
		int a;
		double dist;
		a=(int) (Math.pow(x, 2)+Math.pow(y, 2));
		dist=Math.sqrt(a);
		return dist;
	}
	public void windchill(int t, int v) 

	{
		 double x=Math.pow(v, 0.18);
		 double w =35.74+0.6215*t+(0.4275*t-35.75)*x;
		System.out.println(" "+w);
	}
	
	public void checkwinner() 
	{
	
		
	}
	public void markone(int r, int c) 
	{
		
		
	}
	public void marktwo(int r, int c) 
	{
		
		
	}
	public void take2darray(int row, int column)
	{
	   int x[][]=new int[row][column];
	   System.out.println("Enter the "+row*column+" elements in Array");
	   for(int i=0;i<row;i++)
	   		{
		   		for(int j=0;j<column;j++)
		   			{
		   				x[i][j]=getnumber();
		   			}
	   		}
	   System.out.println("Your 2D array is : ");
	   for(int i=0;i<column;i++)
	   		{
		   		for(int j=0;j<row;j++)
		   			{
		   				System.out.print(x[i][j]+" ");
		   			}
		   		System.out.println(" ");
	   		}
	}
	public int Gamnler(int trails, int stake, int goal) 
	{
	
		int bets=0;
		int wins=0;


		for(int t=0;t<=trails;t++)
		{
		int cash=stake;
		while(cash>0&&cash<goal)
		{
		bets++;
		if(Math.random()<0.5)
		cash++;
		else
		cash--;
		}
		if(cash==goal)
		{
		wins++;
		}
		return wins;
		}
		return 0;
	}
}
	