import java.util.Scanner;
public class Pr4 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
	//	int a = 10;
	//	int b = 20;
	
		System.out.print("Enter value of a: ");
		int a = inp.nextInt();
		System.out.print("Enter value of b: ");
		int b = inp.nextInt();
	
		System.out.print("Before swap value of a & b: "+"\na = "+a+"\nb = "+b);
	
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.print("\nAfter swap value of a & b: "+"\na = "+a+"\nb = "+b);
		
		
	}
}