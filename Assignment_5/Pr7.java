import java.util.Scanner;
public class Pr7 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		int n;
	
	  System .out.print("Enter a positive integer number: ");
	  n = inp.nextInt();
	
	   System.out.print("Factorial of "+ n +" = " + factorial(n));
	}
	public static int factorial(int n) 
	{
	  if(n > 1)
	    return n * factorial(n - 1);
	  else
	    return 1;
	}
}