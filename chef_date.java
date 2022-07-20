\\Chef and his girlfriend go on a date. Chef took XX dollars with him, and was quite sure that this would be enough to pay the bill. At the end, the waiter brought a bill of YY dollars. Print "YES" if Chef has enough money to pay the bill, or "NO" if he has to borrow from his girlfriend and leave a bad impression on her.

\\Input Format
\\The first line of input will contain a single integer TT, denoting the number of test cases.
\\Each test case consists of a single line of input, containing two space-separated integers XX and YY.
\\Output Format
\\For each test case, output on a new line "YES" if Chef has enough money to pay the bill and "NO" otherwise.

\\You may print each character of the string in either uppercase or lowercase (for example, the strings "yEs", "yes", "Yes" and "YES" will all be treated as identical).

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
	    for(int i=0;i<t;i++){
        int x = scan.nextInt();
        int y = scan.nextInt();
	if(x>=y)
	{
	    System.out.println("YES");
	}
	else{
	    System.out.println("NO");	// your code goes here
	}
}}}
