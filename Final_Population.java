//There were initially XX million people in a town, out of which YY million people left the town and ZZ million people immigrated to this town.

//Determine the final population of town in millions.

//Input Format
//The first line of input will contain a single integer TT, denoting the number of test cases.
//The first and only line of each test case consists of three integers XX, YY and ZZ.
//Output Format
//For each test case, output the final population of the town in millions.






import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int t=scan.nextInt();
	    for (int i=0;i<t;i++)
	    {
	       int X=scan.nextInt();
	       int Y=scan.nextInt();
	       int Z=scan.nextInt();
	       System.out.println(X-Y+Z);
	    }
		// your code goes here
	}
}
