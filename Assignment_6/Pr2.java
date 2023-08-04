import java.util.Scanner;
public class Pr2 
{
	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter a number to print square star pattern: ");
		int n = inp.nextInt();
		
		for(int i=0;i < n;i++)
		{
			for(int j=0;j < n;j++)
			{
				if((i==0 || i==n-1) || (j==0 || j==n-1))
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}
	}
}.out.print("   ");
			}
			System.out.println("");
		}
	}
}