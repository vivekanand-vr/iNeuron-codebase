class Demo11 //extends Object
{
	//object properties and methds
	String name="Hyder";
	int age=28;
	
	void disp()
	{
		System.out.println("Demo1 "+ age + name);
	}
}
class Demo12 extends Demo11
{
	
}
class Demo13 extends Demo12
{
	
}



public class LaunchMultilevel {

	public static void main(String[] args) {
		
		Demo13 d=new Demo13();
				d.disp();
				

	}

}
