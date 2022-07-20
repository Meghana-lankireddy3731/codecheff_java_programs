//Chef has recently started playing chess, and wants to play as many games as possible.

//He calculated that playing one game of chess takes at least 2020 minutes of his time.

//Chef has NN hours of free time. What is the maximum number of complete chess games he can play in that time?

//Input Format
//The first line of input will contain a single integer TT, denoting the number of test cases.
//Each test case consists of a single line containing a single integer, NN.
//Output Format
//For each test case, output on a new line the maximum number of complete chess games Chef can play in NN hours.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
	    int t=scan.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int N = scan.nextInt();
	        System.out.println(N*60/20);// your code goes here
	    }
	}
}
