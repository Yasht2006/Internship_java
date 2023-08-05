import java.util.Scanner;

public class Pr14 
{
    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);

        double iBal, amt;
        int acNo, accountType;

        System.out.println("Select an option:");
        System.out.println("1) Press 1 for Savings Account");
        System.out.println("2) Press 2 for Current Account");
        System.out.println("3) Press 3 for Exit");

        int choice;
        do 
        {
            System.out.print("\n\nEnter your choice: ");
            choice = inp.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Savings Account Number: ");
                    acNo = inp.nextInt();

                    iBal = 0.00;
                    SavingAc s = new SavingAc(acNo, iBal);
                    System.out.println("Saving A/C " + acNo + " Initial Balance: ₹" + iBal);

                    System.out.print("Enter deposit amount: ");
                    amt = inp.nextDouble();
                    s.deposit(amt);

                    System.out.print("\nEnter withdrawal amount: ");
                    amt = inp.nextDouble();
                    s.withdrawal(amt);
                    break;

                case 2:
                    System.out.print("Enter Current Account Number: ");
                    acNo = inp.nextInt();

                    iBal = 0.00;
                    CurrentAc c = new CurrentAc(acNo, iBal);
                    System.out.println("Current A/C " + acNo + " Initial Balance: ₹" + iBal);

                    System.out.print("Enter deposit amount: ");
                    amt = inp.nextDouble();
                    c.deposit(amt);

                    System.out.print("\n\nEnter withdrawal amount: ");
                    amt = inp.nextDouble();
                    c.withdrawal(amt);
                    break;

                case 3:
                    System.out.println("Thanks for Using Our System!");

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }
}

abstract class BankAccount
{
	public int acNo;
	public double bal;
	
	public BankAccount(int acNo, double bal)
	{
		this.acNo = acNo;
		this.bal = bal;
	}
	
	public int getAcNo()
	{
		return acNo;
	}
	
	public double getBal()
	{
		return bal;
	}
	
	public double setBal(double bal)
	{
		return this.bal = bal;
	}
	
	abstract public void deposit(double amt);
	
	abstract public void withdrawal(double amt);
	
}

class CurrentAc extends BankAccount 
{
	public CurrentAc(int acNo, double bal)
	{
		super(acNo,bal);
	}
	
	public void deposit(double amt)
	{
		setBal(getBal() + amt);
		
		System.out.print("\n"+amt +"₹ deposit successfully!");
		System.out.print("\nAfter deposit money current balance is: "+getBal());
	}
	
	public void withdrawal(double amt) 
	{
        if (getBal() >= amt) 
        {
            setBal(getBal() - amt);
            System.out.print("\n"+amt + "₹ withdrawal Successfully!");
            System.out.print("\nAfter withdrawal money current balance is: "+getBal());
        } 
        else 
        {
            System.out.println("\nInsufficient Balance!");
        }
    }
}


class SavingAc extends BankAccount 
{
	public SavingAc(int acNo, double bal)
	{
		super(acNo,bal);
	}
	
	public void deposit(double amt)
	{
		setBal(getBal() + amt);
		
		System.out.print("\n"+amt +"₹ deposit successfully!");
		System.out.print("\nAfter deposit money current balance is: "+getBal());
	}
	
	public void withdrawal(double amt) 
	{
        if (getBal() >= amt) 
        {
            setBal(getBal() - amt);
            System.out.print("\n"+amt + "₹ withdrawal Successfully!");
            System.out.print("\nAfter withdrawal money current balance is: "+getBal());
        } 
        else 
        {
            System.out.println("\nInsufficient Balance!");
        }
    }
}