//Alice wrote an exam containing NN true or false questions (i.e. questions whose answer is either true or false). Each question is worth 11 mark and there is no negative marking in the examination. Alice scored KK marks out of NN.

//Bob wrote the same exam but he marked each and every question as the opposite of what Alice did, i.e, for whichever questions Alice marked true, Bob marked false and for whichever questions Alice marked false, Bob marked true.

//Determine the score of Bob.

//Input Format
//The first line contains a single integer TT — the number of test cases. Then the test cases follow.
//The first and only line of each test case contains two space-separated integers NN and KK — the total number of questions in the exam and the score of Alice.
//Output Format
//For each test case, output on a new line the score of Bob.



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int t =scan.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int N =scan.nextInt();
	        int K =scan.nextInt();
	        int result;
	        result=N-K;
	       // int result;
	        System.out.println(result);
	    }
		// your code goes here
	}
}
