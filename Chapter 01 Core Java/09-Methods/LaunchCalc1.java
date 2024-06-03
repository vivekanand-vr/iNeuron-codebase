
class Calculator1
{
	int a, b, c;
	
	void add()
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}	
	
}

public class LaunchCalc1 {

	public static void main(String[] args) {
		
		Calculator1 calc=new Calculator1();
		
		calc.add();

	}

}
