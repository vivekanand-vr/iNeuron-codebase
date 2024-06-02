class Demo1
{
	String name="Hyder";
	int age=28;
	
	void disp()
	{
		System.out.println("Demo1 "+ age + name);
	}
}

class Demo2 extends Demo1
{
	
}
//Demo2 is child class/derived /sub
//Demo1 is parent/base/existing


public class LaunchIn1 
{

	public static void main(String[] args) {
		
		Demo2 demo=new Demo2();
		demo.disp();

	}

}
