//In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of XX bits per second above which his calculations are prone to errors. If Chef is currently working at YY bits per second, is he prone to errors?

//If Chef is prone to errors print YES, otherwise print NO.

//Input Format
//The only line of input contains two space separated integers XX and YY — the threshold limit and the rate at which Chef is currently working at.

//Output Format
//If Chef is prone to errors print YES, otherwise print NO.

//You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).




import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scan =new Scanner(System.in);
	  //int t=scan.nextInt();
	  //for (int i=0;i<t;i++)
	  //{
	    int X=scan.nextInt();
	    int Y=scan.nextInt();
	    if (Y<=X)
	    {
	        System.out.println("NO");
	    }
	    else
	    {
	        System.out.println("YES");
	    }
	  //}
	  // your code goes here
	}
}
