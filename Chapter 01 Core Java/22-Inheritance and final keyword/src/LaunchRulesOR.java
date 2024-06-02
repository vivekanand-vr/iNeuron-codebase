class Demo1
{
	void disp()
	{
		System.out.println("Demo in Parent");
	}
	public void disp2()
	{
		
	}
	public int add()
	{
		return 10+2;
	}
	public int add(int a, int b)
	{
		return a+b;
	}
	
	
}

class Demo2 extends Demo1
{
	public void disp()// we can increase visibility
	{
		
	}
//	void disp2() we cannot reduce visbility
//	{
//		
//	}
//	public void add() return type cannot be changed
//	{
//		System.out.println("Child");
//	}
//	public int add(int a, int b)
//	{
//		return a+b;
//	}
	
	public int add(int a)
	{
		return a;
	}
}



public class LaunchRulesOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
