import java.util.Scanner;
public class Pr2
{
        public static void main(String[] args) 
        {
         	Scanner inp = new Scanner(System.in);
         	
	        String s = "yay";
	        
	        int n=s.length();
	        boolean isPalindrome = true;
	
	        for(int i=0;i<n/2;i++)
	        {
				if(s.charAt(i)!=s.charAt(n-i-1))
				{
					isPalindrome=false;
					break;
				}
			}
			if(isPalindrome)
			{
				System.out.println("Given String is Palindrome");
			}
			else
			{
				System.out.println("Given String is Not palindrome");
			}
    }
}
