Chef wants to give a burger party to all his NN friends i.e. he wants to buy one burger for each of his friends.

The cost of each burger is XX rupees while Chef has a total of KK rupees.

Determine whether he has enough money to buy a burger for each of his friends or not.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains the three integers NN, XX, and KK - the number of Chef's friends, the cost of each burger, and the total money Chef has, respectively.
Output Format
For each test case, output YES if the Chef can give a party to all his NN friends. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).




import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan =new Scanner(System.in);
	    int t=scan.nextInt();
	    for(int i=0;i<t;i++)
	    {
	    int N=scan.nextInt();
	    int X=scan.nextInt();
	    int K=scan.nextInt();
	    int Z;
	    Z =N*X;
	    if (Z > K)
	    {
	        System.out.println("NO");
	    }
	    else{
	        System.out.println("YES");
	    }
	    }
		// your code goes here
	}
}
