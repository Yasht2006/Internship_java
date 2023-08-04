import java.util.Scanner;
public class Pr5 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = inp.nextInt();
		
		int sqr = n*n;
		int sum=0;
		
		while(sqr > 0)
		{
			sum += sqr % 10;
			sqr = sqr/10;
		}
		if(sum == n)
		{
			System.out.println(n+" is Neon number");
		}
		else
		{
			System.out.println(n+" is not Neon number");
		}
	}
}