import java.util.Scanner;
public class Pr5 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		int a_len = 0;
		System.out.print("Enter length of array: ");
		a_len = inp.nextInt();
		
		int a[] = new int[a_len];
		System.out.print("Enter element of the array: ");
		for(int i=0;i<a_len;i++)
		{
			a[i]=inp.nextInt();
		}
		
		boolean found = false;
		
		for(int i=0;i<a.length;i++)
		{
			int sum = 0;
			for(int j=i;j<a.length;j++)
			{
				sum = sum + a[j];
				 if (sum == 0) 
				 {
                    found = true;
                    System.out.println(" True");
                    System.out.println("There is a sub-array with zero sum from index " + i + " to " + j + ".");
                    break;
                }
			}
			if (found) 
			{
                break;
            }
		}
		if (!found) 
		{
            System.out.println("False");
            System.out.println("No sub-array with zero sum found.");
        }
	}
}