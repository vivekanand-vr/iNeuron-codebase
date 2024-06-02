
public class LaunchStaticControlFlow {
	static int a;
	static int b;
	
	static
	{
		System.out.println("Static block");
		a=10;
		b=20;
	}
	static void disp()
	{
		System.out.println("Static disp method");
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		disp();
	}

}
