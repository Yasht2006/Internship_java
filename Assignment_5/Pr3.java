public class Pr3 
{
	public static void main(String[] args) 
	{
		print(1);
	}
	public static void print(int n)
	{
		System.out.println(n);
		
		n = n+1;
		if(n<=100)
		{
			print(n);
		}
		
	}
}