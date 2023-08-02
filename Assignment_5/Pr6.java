import java.util.Scanner;
public class Pr6 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		int arrLen = 0;
		System.out.print("Enter length of the array: ");
		arrLen = inp.nextInt();
		
		int arr[] = new int[arrLen];
		System.out.print("Enter the element of array: ");
		for(int i=0;i<arrLen;i++)
		{
			arr[i] = inp.nextInt();
		}
		
		int count = 0; 

        for (int i = 0; i < arrLen; i++)
        {
            if (arr[i] != 0)
            {
                arr[count++] = arr[i];
            }
        } 
        while (count < arrLen)
        {
            arr[count++] = 0;
        }
	
			System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<arrLen; i++)
        {
            System.out.print(arr[i]+" ");
        }
	}
}