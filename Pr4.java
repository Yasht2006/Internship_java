import java.util.Scanner;
class Pr4
{
	public static void main(String args[])
	{
		
		Scanner inp = new Scanner(System.in);
		
		int n,count;
		
		System.out.print("Enter no: ");
		n = inp.nextInt();
		
		System.out.println("Prime number between 1 to "+n+" is: ");
		for(int i = 1;i <= n;i++)
		{	
			count = 0;
			for(int j = 2;j <= i/2;j++)
			{
				if(i % j == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.println(i);
			}
		}
	}
}