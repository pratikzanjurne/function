package username;

import com.bridgelabz.utility.Utility;

public class Gambler
{
public static void main(String args[])
{
int trails;

Utility u=new Utility();
System.out.println("Enter the trails");
trails=u.getnumber();
System.out.println("Enter the Stake");
int stake=u.getnumber();
System.out.println("Enter your Goal");
int goal=u.getnumber();
int win =u.Gamnler(trails,stake,goal);
System.out.println(win+"wins of" +trails);
System.out.println("percent of games won="+100.0*win/trails);


}
}
