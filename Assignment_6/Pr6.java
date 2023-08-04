import java.util.Scanner;
public class Pr6 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = inp.nextInt();
		
		int num1=0;
		int num2=1;
		
		System.out.print("Fibonacci Series for "+ n +" terms: \n");
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(num1 +" ");
			
			int num3 = num1+num2;
			num1=num2;
			num2=num3;
		}
	}
}