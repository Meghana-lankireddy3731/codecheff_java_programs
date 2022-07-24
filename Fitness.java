//Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is XX km away from his home.

//If his office is open on 55 days in a week, find the number of kilometers Chef travels through office trips in a week.

//Input Format
//First line will contain TT, number of test cases. Then the test cases follow.
//Each test case contains of a single line consisting of single integer XX.
//Output Format
//For each test case, output the number of kilometers Chef travels through office trips in a week.




import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan = new Scanner(System.in);
	   int t =scan.nextInt();
	   for (int i=0;i<t;i++)
	   {
	       int X =scan.nextInt();
	       System.out.println((X+X)*5);
	   }// your code goes here
	}
}
