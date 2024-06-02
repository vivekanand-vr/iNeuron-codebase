class Parentt
{
	int a, b;
	
	Parentt()
	{
		
		a=10;
		b=20;
		System.out.println("Parentt Const");
	}
	Parentt(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parentt para Const");
	}
	
}

class Childd extends Parentt
{
	
	int x, y;
	
	Childd()
	{
		this(111,222);
		x=100;
		y=200;
	}
	Childd(int x, int y)
	{
		
		this.x=x;
		this.y=y;
	}
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		
	}
}
public class LaunchConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childd ch=new Childd();
		ch.disp();
		Childd ch1=new Childd(1000,2000);
		ch1.disp();
		
	}

}
