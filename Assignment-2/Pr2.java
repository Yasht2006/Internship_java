import java.util.Scanner;
public class Pr2 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        int a1_len=0;
        System.out.print("Enter length of array: ");
        a1_len = inp.nextInt();
        int a1[] = new int[a1_len];
        System.out.print("Enter elements of the array: ");
        for(int i=0;i<a1_len;i++)
        {
        	a1[i] = inp.nextInt();
        }
 
        int firstRepeatElement = FindFirstRepeatElement(a1);
        
        if (firstRepeatElement != 0) 
        {
            System.out.println("First repeating element: " + firstRepeatElement);
        } 
        else 
        {
            System.out.println("No repeat element in the array.");
        }
    }
    
    public static int FindFirstRepeatElement(int[] a1) 
    {    
        for (int i = 0; i < a1.length - 1; i++) 
        {
            for (int j = i + 1; j < a1.length; j++) 
            {
                if (a1[i] == a1[j]) 
                {
                    return a1[i];
                }
            }
        }
        return 0;
    }
}
