import java.util.Scanner;
public class Pr3
{
   public static void main(String[] args)
   {
      Scanner inp = new Scanner(System.in);      
      System.out.print("Enter the number of rows: ");
      int n = inp.nextInt();
      
      for(int i=0; i<n; i++)
      {
         for(int space=n; space>i; space--)
         {
            System.out.print("  ");
         }
         int num=1;
         for(int j=0; j<=i; j++)
         {
            System.out.print(num+ "   ");
            num = num*(i-j)/(j+1);
         }
         System.out.println("");
      }
   }
}