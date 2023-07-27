import java.util.Scanner;
public class Pr3 {
	public static void main(String[] args) {
	       
	       Scanner inp = new Scanner(System.in);
	       
        int n=153 , tn, temp, total = 0;
        

        
        tn = n;
        while (tn != 0)
        {
            temp = tn % 10;
            total = total + temp * temp * temp;
            tn /= 10;
        }

        if(total == n)
            System.out.println(n + " is an Armstrong number!");
        else
            System.out.println(n + " is not an Armstrong number!");
	}
}