
class Demo1
{
	int a;
	int b;
	
	static int count;
	
	
	{
		count++;
		System.out.println("Hello");
	}
	
	Demo1()
	{
		this(100);
		System.out.println("First con");
	}
	Demo1(int a)
	{
		System.out.println(a);
		this.a=a;
		
	}
	Demo1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
}


public class LaunchNonStaticBlock {

	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1(10,20);
		Demo1 d3=new Demo1(10);
		
		System.out.println(Demo1.count);

	}

}
