import java.util.Scanner;
import java.util.Arrays;
public class Pr3 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		int a1_len=0;
		System.out.print("Enter length of array: ");
		a1_len = inp.nextInt();
		int a1[] = new int[a1_len];
		System.out.print("Enter element of the array: ");
		for(int i=0;i<a1_len;i++)
		{
			a1[i] = inp.nextInt();
		}
		
		Arrays.sort(a1);
		int smallele = 1;
		for(int n : a1)
		{
			if(n <=smallele)
			{
				smallele = smallele + n;
			}
			else
			{
				break;
			}
		}
		System.out.println("Smallest unrepresented integer element in array: "+smallele);
	}
}