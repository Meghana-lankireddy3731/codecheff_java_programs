Six friends go on a trip and are looking for accommodation. After looking for hours, they find a hotel which offers two types of rooms — double rooms and triple rooms. A double room costs Rs. XX, while a triple room costs Rs. YY.

The friends can either get three double rooms or get two triple rooms. Find the minimum amount they will have to pay to accommodate all six of them.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the cost of a double room and the cost of a triple room.
Output Format
For each testcase, output the minimum amount required to accommodate all the six friends.




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
	    for( int i=0;i<t;i++)
	    {
	        int x=scan.nextInt();
	        int y=scan.nextInt();
	        System.out.println(Math.min(3*x,2*y));
	    }
		// your code goes here
	}
}
