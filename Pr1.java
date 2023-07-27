import java.util.Scanner;

public class Pr1{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
         int n = inp.nextInt();
        
          checkNum(n);
    }

    public static void checkNum(int n)
     {
        if (n % 2 == 1)
         {
            System.out.println("Weird");
        }
         else if (n % 2 == 0 && n >= 2 && n <= 5) 
         {
            System.out.println("Not Weird");
        } 
        else if (n % 2 == 0 && n >= 6 && n <= 20)
         {
            System.out.println("Weird");
        } 
        else if (n % 2 == 0 && n > 20) 
        {
            System.out.println("Not Weird");
        }
    }
}
