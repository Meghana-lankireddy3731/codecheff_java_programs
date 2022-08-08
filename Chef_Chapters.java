//This semester, Chef took XX courses. Each course has YY units and each unit has ZZ chapters in it.

//Find the total number of chapters Chef has to study this semester.

//Input Format
//The first line will contain TT, the number of test cases. Then the test cases follow.
//Each test case consists of a single line of input, containing three space-separated integers X, Y,X,Y, and ZZ.
//Output Format
//For each test case, output in a single line the total number of chapters Chef has to study this semester.



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
	  for (int i=0;i<t;i++)
	  {
	     int X=scan.nextInt();
	     int Y=scan.nextInt();
	     int Z=scan.nextInt();
	     System.out.println(X*Y*Z);// goes here
	}
}
}
