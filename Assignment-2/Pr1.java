import java.util.Scanner;
public class Pr1 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        
        int a1_len=0,a2_len=0,a3_len=0;
        System.out.print("Enter length of first array: ");
        a1_len = inp.nextInt();
        int a1[] = new int[a1_len];
        System.out.print("Enter elements of first array in sequence: ");
        for(int i=0;i<a1_len;i++)
        {
        	a1[i] = inp.nextInt();
        }
        
        System.out.print("Enter length of second array: ");
        a2_len = inp.nextInt();
        int a2[] = new int[a2_len];
        System.out.print("Enter elements of secon array in sequence: ");
        for(int i=0;i<a2_len;i++)
        {
        	a2[i] = inp.nextInt();
        }
        
        System.out.print("Enter length of third array: ");
        a3_len = inp.nextInt();
        int a3[] = new int[a3_len];
        System.out.print("Enter elements of third array in sequence: ");
        for(int i=0;i<a3_len;i++)
        {
        	a3[i] = inp.nextInt();
        }
        
		int i=0,j=0,k=0;
		System.out.print("Common elements are: ");

        while ( i < a1.length &&  j < a2.length && k < a3.length) 
        {
            if (a1[i] == a2[j] && a2[j] == a3[k]) 
            {
                System.out.print(a1[i] + " ");
                i++;
                j++;
                k++;
            }
            else if (a1[i] < a2[j])
            {
                i++;
            }
            else if (a2[j] < a3[k]) 
            {
                j++;
            }            
            else 
            {
                k++;
            }
        }
    }
}
