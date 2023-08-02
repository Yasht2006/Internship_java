import java.util.Scanner;
public class Pr2 
{
	public static void main(String[] strings)
	{
		Scanner inp = new Scanner(System.in);

        int day,month; 
        String monthName = "";

		System.out.print("Enter a year: ");
        int year = inp.nextInt();
        
        System.out.print("Enter a month in number(1 - 12): ");
        month = inp.nextInt();
        
        if(month == 0  && month > 12)
        {
        	System.out.print("Enter valid month number!");
        }
        else
        {

	        switch (month) 
	        {
	            case 1:
	                monthName = "January";
	                day = 31;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 2:
	                monthName = "February";
	                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	                    day = 29;
	                } else {
	                    day = 28;
	                }
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 3:
	                monthName = "March";
	                day = 31;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 4:
	                monthName = "April";
	                day = 30;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 5:
	                monthName = "May";
	                day = 31;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 6:
	                monthName = "June";
	                day = 30;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 7:
	                monthName = "July";
	                day = 31;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 8:
	                monthName = "August";
	                day = 31;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 9:
	                monthName = "September";
	                day = 30;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 10:
	                monthName = "October";
	                day = 31;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 11:
	                monthName = "November";
	                day = 30;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	            case 12:
	                monthName = "December";
	                day = 31;
	                System.out.print(monthName + " " + year + " has " + day + " days\n");
	                break;
	        }    
	    }    
    }
}