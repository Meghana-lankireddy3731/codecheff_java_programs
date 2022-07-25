//Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument, and decided to settle the matter once and for all.

//Charlie measured the heights of Alice and Bob, and got to know that Alice's height is XX centimeters and Bob's height is YY centimeters. Help Charlie decide who is taller.

//It is guaranteed that X \neq YX=Y.

//Input Format
//The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
//The first and only line of each test case contains two integers XX and YY, as described in the problem statement.




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
	  for (int i=0;i<t;i++)
	  {
	     int A =scan.nextInt();
	     int B =scan.nextInt();
	     if (A>B)
	     {
	         System.out.println("A");
	     }
	     else{
	         System.out.println("B");
	     }
	  }// your code goes here
	}
}
