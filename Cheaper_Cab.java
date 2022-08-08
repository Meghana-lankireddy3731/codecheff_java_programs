Chef has to travel to another place. For this, he can avail any one of two cab services.

The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).










import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scan =new Scanner(System.in);
	  int t =scan.nextInt();
	  for(int i=0;i<t;i++)
	  {
	    int X =scan.nextInt();
	    int Y =scan.nextInt();
	    if (X<Y)
	    {
	        System.out.println("FIRST");
	    }
	    else if (X == Y)
	    {
	        System.out.println("ANY");
	    }
	    else if (X>Y)
	    {
	        System.out.println("SECOND");
	    }
	  }// your code goes here
	}
}
