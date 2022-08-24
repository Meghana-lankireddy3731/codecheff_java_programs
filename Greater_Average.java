You are given 33 numbers A, B,A,B, and CC.

Determine whether the average of AA and BB is strictly greater than CC or not?

NOTE: Average of AA and BB is defined as \frac{(A+B)}{2} 
2
(A+B)
​
 . For example, average of 55 and 99 is 77, average of 55 and 88 is 6.56.5.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of 33 integers A, B,A,B, and CC.
Output Format
For each test case, output YES if average of AA and BB is strictly greater than CC, NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YeS, yEs, yes and YES will all be treated as identical).




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
	    for (int i=0;i<t;i++)
	    {
	      float A=scan.nextInt();
	      float B=scan.nextInt();
	      float C=scan.nextInt();
	      float X;
	      X = A + B;
	      float Z = X/2;
	      //Z=(A+B)/2;
	      //System.out.println("Z Value:" +Z);
	      //System.out.println(B);
	      //System.out.println(C);
	      //System.out.println(Z);
	      
	      if (Z == C)
	      {
	          System.out.println("NO");
	      }
	      else if (Z < C)
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
