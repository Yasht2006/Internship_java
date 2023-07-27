import java.util.Scanner;
public class Pr8{
	public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter year: ");
			int year = inp.nextInt();
		
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("leap year ");
				}
				else
					System.out.println(" not leap year ");
			}
			else
				System.out.println("leap year ");
		}
		else 
			System.out.println("not leap year ");
	}
}