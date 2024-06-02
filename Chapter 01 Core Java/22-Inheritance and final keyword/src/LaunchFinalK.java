
//final class Vehicle
//{
//	void disp()
//	{
//		System.out.println("vehicle");
//	}
//}


//class Car extends Vehicle //final class we cannot inherit
//{ 
//	   // final class doesn't participate in inheritance
//}
 class Vehicle
{
	 int i=10;
	final void disp()
	{
		i=20;
		System.out.println(i);
		System.out.println("vehicle");
	}
}
 class Car extends Vehicle
 {
//	 void disp() final will get inheirted but we cannot ovveriride
//	 {
//		 System.out.println("disp");
//	 }
 }

public class LaunchFinalK {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.disp();

	}

}
