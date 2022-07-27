//Chef is eagerly waiting for a piece of information. His secret agent told him that this information would be revealed to him after KK weeks.

//XX days have already passed and Chef is getting restless now. Find the number of remaining days Chef has to wait for, to get the information.

//It is guaranteed that the information has not been revealed to the Chef yet.

//Input Format
//The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
//The first and only line of each test case contains two space-separated integers KK and XX, as described in the problem statement.



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    int t =scan.nextInt();
	    for (int i=0;i<t;i++)
	    {
	       int K =scan.nextInt();
	       int X =scan.nextInt();
	       System.out.println((7*K)-X);
	    }
	}
		// your code goes here
}
