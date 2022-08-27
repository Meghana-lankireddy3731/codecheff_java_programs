MoEngage helps the Chef send email reminders about rated contests to the participants.

There are a total of NN participants on Chef’s platform, and UU of them have told Chef not to send emails to them.

If so, how many participants should MoEngage send the contest emails to?

Input Format
The first and only line of input will contain a single line containing two space-separated integers NN (the total number of users) and UU (the number of users who don't want to receive contest reminders).
Output Format
Output in a single line, the number of users MoEngage has to send an email to.



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan=new Scanner(System.in);
	    int N=scan.nextInt();
	    int U=scan.nextInt();
	    System.out.println(N-U);
		// your code goes here
	}
}
