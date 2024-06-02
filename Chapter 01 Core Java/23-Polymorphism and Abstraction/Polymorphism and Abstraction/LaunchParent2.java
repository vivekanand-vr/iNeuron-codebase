
class Parents
{
	public void cry()
	{
		System.out.println("Parents crying");
	}
}

class Child11 extends Parents
{
	public void cry()
	{
		System.out.println("Child1 crying");
	}
	public void eat()
	{
		System.out.println("Child 1 eats less");
	}
	
}
class Child12 extends Parents
{
	public void cry()
	{
		System.out.println("Child2 crying");
	}
	public void eat()
	{
		System.out.println("Child 2 eats more");
	}
}
public class LaunchParent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parents p=new Child11();
		p.cry();
		//p.eat(); // directly using parent type ref yopu cannot called child class specilzed methods
		((Child11) p).eat();//downcasting
		
		Parents p2=new Child12();
		p2.cry();
		((Child12) p2).eat();

	}

}
