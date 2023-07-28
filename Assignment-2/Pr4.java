import java.util.Scanner;
public class Pr4 
{
	public static void main(String[] args)
    {
		Scanner inp = new Scanner(System.in);
		int a1_len = 0;
		System.out.print("Enter length of array: ");
		a1_len = inp.nextInt();
		int a[] = new int[a1_len];
		System.out.print("Enter elements of array: ");
		for(int i=0;i<a1_len;i++)
		{
			a[i] = inp.nextInt();
		}
		
		int n = a.length;
		
		rearrange(a,n);
		System.out.println("Rearrange array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	static void rearrange(int a[],int n)
	{
		int i=0;
		int j=n-1;
		
		while(i<j)
		{
			while(i <= n && a[i]>0)
			{
				i+=1;
			}
			while(j>=0 && a[j]<0)
			{
				j-=1;
			}
			if(i<j)
			{
				swap(a,i,j);
			}
		}
		if(i==0 || i==n)
			return;
		int k=0;
		while(k<n && i<n)
		{
			swap(a,k,i);
			i=i+1;
			k=k+2;
		}	
	}
	static void swap(int a[],int i,int j)
	{
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}
	
}