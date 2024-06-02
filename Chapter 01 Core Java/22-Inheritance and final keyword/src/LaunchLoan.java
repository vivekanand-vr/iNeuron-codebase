class Loan
{
	void disp()
	{
		System.out.println("Welcome to INEURON BANK");
	}
}
class PersonalLoan extends Loan
{
	void disp()
	{
		System.out.println("Personal loan app");
	}
}



public class LaunchLoan 
{
	public static void main(String[] args)
	{
		PersonalLoan pl=new PersonalLoan();
		pl.disp();
	}
}
