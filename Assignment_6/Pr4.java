import java.util.Scanner;
public class Pr4 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = inp.nextInt();
		
		for (int i = n-1; i >= 0; i--) 
		{
    		for (int j = n - i; j > 1; j--) 
    		{
        		System.out.print(" ");
    		}
    		for (int k = 0; k <= i; k++) 
    		{
        		System.out.print("*" + " ");
    		}
    		System.out.println("");
		}
		for (int i = 0; i < n; i++) 
		{
    		for (int j = n - i; j > 1; j--) 
    		{
        		System.out.print(" ");
    		}
    		for (int k = 0; k <= i; k++) 
    		{
        		System.out.print("*" + " ");
    		}
    		System.out.println("");
		}
	}
}