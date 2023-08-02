import java.util.Scanner;
public class Pr5 
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int arrLen;
		System.out.print("Enter the  length of array: ");
		arrLen = inp.nextInt();
		
		int arr[] = new int[arrLen];
		System.out.print("Enter the  element of array: ");
		for(int i=0;i<arrLen;i++)
		{
			arr[i] = inp.nextInt();
		}
		
		System.out.print("Enter the number: ");		int n = inp.nextInt();
		boolean isFound = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				isFound = true;
				for(int j=i; j<arrLen-1; j++)
				{
               	arr[j] = arr[j+1];
				}
				arrLen--;
				break;
			}
		}			
		if(!isFound)
		{
			System.out.println("Array element not found!");
		}
		else
		{
			System.out.println("Remove element Successfully!");
		}
	}
}