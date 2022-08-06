//Chef wants to conduct a lecture for which he needs to set up an online meeting of exactly XX minutes.

//The meeting platform supports a meeting of maximum 3030 minutes without subscription and a meeting of unlimited duration with subscription.

//Determine whether Chef needs to take a subscription or not for setting up the meet.

//Input Format
//First line will contain TT, the number of test cases. Then the test cases follow.
//Each test case contains a single integer XX - denoting the duration of the lecture.
//Output Format
//For each test case, print in a single line, YES if Chef needs to take the subscription, otherwise print NO.

//You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).




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
	        int X =scan.nextInt();
	        if (X<=30)
	        {
	            System.out.println("NO");
	        }
	        else
	        {
	            System.out.println("YES");
	        }
	    }
		// your code goes here
	}
}
