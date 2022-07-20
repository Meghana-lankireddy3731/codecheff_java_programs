//Chef decided to redecorate his house, and now needs to decide between two different styles of interior design.For the first style, tiling the floor will cost X_1X 
//For the first style, tiling the floor will cost X1 rupees and painting the walls will cost Y1 rupees.
//For the second style, tiling the floor will cost X2 rupees and painting the walls will cost Y2 rupees.
//Chef will choose whichever style has the lower total cost. How much will Chef pay for his interior design?
//Input Format
//The first line of input will contain a single integer T denoting the number of test cases.
//Each test case consists of a single line of input, containing 4 space-separated integers X1 Y1 X2 Y2 as described in the statement.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scan = new Scanner(System.in);
	int t = scan.nextInt();
	for(int i=0;i<t;i++)
	{
	  int X1 = scan.nextInt();
	  int Y1 = scan.nextInt();
	  int X2 = scan.nextInt();
	  int Y2 = scan.nextInt();
	  int cost1;
	  int cost2;
	  int result;
	  cost1 = X1+Y1;
	  cost2 = X2+Y2;
	  result = Math.min(cost1, cost2);
	  System.out.println(result);
	  //if((X1+Y1) <= (X2+Y2))
	  //{
	  //System.out.println(X1+Y1);
    //}
    //else{
      //  System.out.println(X2+Y2);// your code goes here
	//}
}
}
}
