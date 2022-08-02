//Chef's coding class is very famous in Chefland.

//This year XX students joined his class and each student will require one chair to sit on. Chef already has YY chairs in his class. Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.

//Input Format
//The first line contains a single integer TT — the number of test cases. Then the test cases follow.
//The first and only line of each test case contains two integers XX and YY — the number of students in the class and the number of chairs Chef already has.
//Output Format
//For each test case, output the minimum number of extra chairs Chef must buy so that every student gets one chair.


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan =new Scanner(System.in);
	    int t=scan.nextInt();
	    for (int i=0;i<t;i++)
	    {
	      int X=scan.nextInt();
	      int Y=scan.nextInt();
	      int result;
	      result =X-Y;
	      if (X>Y)
	      {
	          System.out.println(result);
	      }
	      else
	      {
	          System.out.println(0);
	      }
	    }
		// your code goes here
	}
}
