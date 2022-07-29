//Chef considers the climate HOT if the temperature is above 2020, otherwise he considers it COLD. You are given the temperature CC, find whether the climate is HOT or COLD.

//Input Format
//The first line of input will contain a single integer TT, denoting the number of test cases.
//The first and only line of each test case contains a single integer, the temperature CC.
//Output Format
//For each test case, print on a new line whether the climate is HOT or COLD.

//You may print each character of the string in either uppercase or lowercase (for example, the strings hOt, hot, Hot, and HOT will all be treated as identical).



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
	        int C =scan.nextInt();
	        if (C>20)
	        {
	            System.out.println("HOT");
	        }
	        else
	        {
	            System.out.println("COLD");
	        }
	    }
		// your code goes here
	}
}
