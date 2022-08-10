//Alice and Bob are very good friends and they always distribute all the eatables equally among themselves.

//Alice has AA chocolates and Bob has BB chocolates. Determine whether Alice and Bob can distribute all the chocolates equally among themselves.

//Note that:

//It is not allowed to break a chocolate into more than one piece.
//No chocolate shall be left in the distribution.
//Input Format
//The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
//The first and only line of each test case contains two space-separated integers AA and BB, the number of chocolates that Alice and Bob have, respectively.
//Output Format
//For each test case, output on a new line \texttt{YES}YES if Alice and Bob can distribute all the chocolates equally, else output \texttt{NO}NO. The output is case insensitive, i.e, \texttt{yes}yes, \texttt{YeS}YeS, \texttt{yES}yES will all be accepted as correct answers when Alice and Bob can distribute the chocolates equally.






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
	        int A =scan.nextInt();
	        int B =scan.nextInt();
	        int X;
	        X=A+B;
	        if (X%2 == 0)
	        {
	            System.out.println("YES");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	    }
		// your code goes here
	}
}
