//Chef took an examination two times. In the first attempt, he scored XX marks while in the second attempt he scored YY marks. According to the rules of the examination, the best score out of the two attempts will be considered as the final score.

//Determine the final score of the Chef.

//Input Format
//The first line contains a single integer TT — the number of test cases. Then the test cases follow.
//The first line of each test case contains two integers XX and YY — the marks scored by Chef in the first attempt and second attempt respectively.
//Output Format
//For each test case, output the final score of Chef in the examination.



/* package codechef; // don't place package name! */

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
	     int X =scan.nextInt();
	     int Y =scan.nextInt();
	     int result;
	     result =Math.max(X,Y);
	     System.out.println(result);
	   }  // your code goes here
	}
}
