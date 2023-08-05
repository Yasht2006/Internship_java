import java.util.Scanner;

public class Pr13 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        String firstName,lastName, jobTitle;
        int empId;
        
        System.out.print("Enter your  first name: ");
        firstName = inp.nextLine();

        System.out.print("Enter your last name: ");
        lastName = inp.nextLine();

        Person p = new Person(firstName, lastName);

        System.out.println("\nFirst Name: " + p.getFirstName());
        System.out.println("Last Name: " + p.getLastName());

        System.out.print("\nEnter your first name: ");
        firstName = inp.nextLine();

        System.out.print("Enter your last name: ");
        lastName = inp.nextLine();

        System.out.print("Enter your employee ID: ");
        empId = inp.nextInt();

        System.out.print("Enter job title: ");
        jobTitle = inp.next();

        Employee e = new Employee(firstName, lastName, empId, jobTitle);

        System.out.println("\nFirst Name: " + e.getFirstName());
        System.out.println("Last Name with Job Title: " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmpId());
    }
}

class Person
{
	public  String firstName;
	public  String lastName;
	
	public Person(String firstName, String lastName )
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
}
class Employee extends Person 
{
	public int empId;
	public String jobTitle;
	
	public Employee(String firstName, String lastName, int empId, String jobTitle)
	{
		super(firstName,lastName);
		this.empId = empId;
		this.jobTitle = jobTitle;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public String getLastName()
	{
		return super.getLastName() +" ("+ jobTitle +")";
	}
}