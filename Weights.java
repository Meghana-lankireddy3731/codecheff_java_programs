Chef is playing with weights. He has an object weighing WW units. He also has three weights each of X, Y,X,Y, and ZZ units respectively. Help him determine whether he can measure the exact weight of the object with one or more of these weights.

If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of single line containing a four positive integers W, X, Y,W,X,Y, and ZZ.
Output Format
For each test case, output on a new line YES if it is possible to measure the weight of object with one or more of these weights, otherwise print NO.

You may print each character of the string in either uppercase or lowercase (for example, the strings yes, YES, Yes, and yeS will all be treated as identical).







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
	      int W=scan.nextInt();
	      int X=scan.nextInt();
	      int Y=scan.nextInt();
	      int Z=scan.nextInt();
	      if (X == W || Y==W || Z == W || X+Y == W || X+Z == W || Y+Z == W || X+Y+Z ==W)
	      {
	          System.out.println("YES");
	      }
	      else{
	          System.out.println("NO");
	      }
	    }
		// your code goes here
	}
}
