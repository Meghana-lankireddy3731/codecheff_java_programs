Chef rented a car for a day.

Usually, the cost of the car is Rs 1010 per km. However, since Chef has booked the car for the whole day, he needs to pay for at least 300300 kms even if the car runs less than 300300 kms.

If the car ran XX kms, determine the cost Chef needs to pay.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of a single integer XX - denoting the number of kms Chef travelled.
Output Format
For each test case, output the cost Chef needs to pay.
  
  
  
  
  
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
	        if (x >= 300)
	        {
	        System.out.println(x*10);
	        }
	        else{
	            System.out.println(300*10);
	        }
	    }
		// your code goes here
	}
}
