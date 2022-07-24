//Chef is fond of burgers and decided to make as many burgers as possible.

//Chef has AA patties and BB buns. To make 11 burger, Chef needs 11 patty and 11 bun.
//Find the maximum number of burgers that Chef can make.

//Input Format
//The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
//The first and only line of each test case contains two space-separated integers AA and BB, the number of patties and buns respectively.
//Output Format
//For each test case, output the maximum number of burgers that Chef can make.





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
		  //int result;
		  //result =min(A,B);
		  System. out. println(Math. min(A, B));
		  //System.out.println(result);
		}// your code goes here
	}
}
