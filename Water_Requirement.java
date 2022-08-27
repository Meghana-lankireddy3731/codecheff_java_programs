Finally, after purchasing a water cooler during the April long challenge, Chef noticed that his water cooler requires 22 liters of water to cool for one hour.

How much water (in liters) would be required by the cooler to cool for NN hours?

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains an integer NN, as described in the problem statement.
Output Format
For each test case, output the number of liters of water required by the water cooler to cool for NN hours.



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    int t=scan.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int N=scan.nextInt();
	        System.out.println(N*2);
	    }
		// your code goes here
	}
}
