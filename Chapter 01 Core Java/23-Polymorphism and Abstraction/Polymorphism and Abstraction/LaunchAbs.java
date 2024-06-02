abstract class Loan1
{

	abstract public void dispInt();
	
	 public void welcomeNote()
	{
		System.out.println("Welcome to xxx bank");
	}
}

class HomeLoan1 extends Loan1
{

	
	public void dispInt()
	{
	
		System.out.println("RI is 12%");
		
	}
	//abstract public void dispInt();
}
class EducationLoan1 extends Loan1
{

	
	public void dispInt() 
	{
		System.out.println("RI is 10%");
	}
	
}

public class LaunchAbs {

	public static void main(String[] args) {
		
		//Loan1 l=new Loan1();
		// we cannot create object of abstract class
		
		Loan1 loan=new HomeLoan1();
		
		// we can create ref of abstract class
		loan.dispInt();
		loan.welcomeNote();
		
		Loan1 loan1=new EducationLoan1();
		loan1.dispInt();
		loan1.welcomeNote();

	}

}
