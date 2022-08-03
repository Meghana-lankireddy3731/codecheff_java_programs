//Alice buys a toy with a selling price of 100100 rupees. There is a discount of xx percent on the toy. Find the amount Alice needs to pay for it.

//Input Format
//The first line of input will contain a single integer TT, denoting the number of test cases.
//The first and only line of each test case contains a single integer, xx — the discount on the toy.


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
	      int x =scan.nextInt();
	      System.out.println(100-x);
	  }// your code goes here
	}
}
