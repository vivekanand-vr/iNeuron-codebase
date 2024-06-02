//class Demo123 extends Demo321
//{
	
//}
//class Demo321 extends Demo123
//{
	
//}

class Parent11
{
	private String name;
	
	Parent11()
	{
		System.out.println("Parent Constructor");
	}
	void disp()
	{
		System.out.println("Parent ");
	}
}
class Child11 extends Parent11
{
	//Child11()
	//{
		//super();
	//}
	void disp2()
	{
		//name="Hyder"; private memebrs will not participate in inheirtamce
	}
}
public class LaunchCyclic {

	public static void main(String[] args) {
		Child11 c=new Child11();
		c.disp();

	}

}
