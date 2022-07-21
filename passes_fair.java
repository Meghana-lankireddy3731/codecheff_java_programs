//There is a fair going on in Chefland. Chef wants to visit the fair along with his N friends. Chef manages to collect K passes for the fair. Will Chef be able to enter the fair with all his N friends?

//A person can enter the fair using one pass, and each pass can be used by only one person.

//Input Format
//The first line of input will contain a single integer T, denoting the number of test cases.
//Each test case consists of a single line containing two space-separated integers N, K.
//Output Format
//For each test case, print on a new line YES if Chef will be able to enter the fair with all his NN friends and NO otherwise.

//You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).




import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    //int t;
	    int t = scan.nextInt();
	    for (int i=0;i<t;i++)
	    {
	        //int N;
	        //int K;
	        int N = scan.nextInt();
	        int K = scan.nextInt();
	        if((N+1) <=K)
	        {
	            System.out.println("YES");
	        }
	        else
	        {
	            System.out.println("NO");
	            
	        }
	    }
		// your code goes here
	}
}
