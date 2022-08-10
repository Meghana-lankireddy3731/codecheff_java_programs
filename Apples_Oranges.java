//Bob has XX rupees and goes to a market. The cost of apples is Rs. AA per kg and the cost of oranges is Rs. BB per kg.

//Determine whether he can buy at least 11 kg each of apples and oranges.

//Input Format
//The first line of input will contain an integer XX, the amount of money Bob has.
//The second line of input contains two space-separated integers AA and BB, the cost per kg of apples and oranges respectively.
//Output Format
//Print a single line containing Yes if Bob can buy the fruits and No otherwise.

//You may print each character of the string in uppercase or lowercase (for example, the strings yes, Yes, yEs, and YES will all be treated as identical).



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    int X =scan.nextInt();
	    int A =scan.nextInt();
	    int B =scan.nextInt();
	    int Z;
	    Z = A+B;
	    if (Z <= X)
	    {
	        System.out.println("YES");
	    }
	    else
	    {
	        System.out.println("NO");
	    }
		// your code goes here
	}
}
