class Plane
{
	public void takeOff()
	{
		System.out.println("Plane is taking off");
	}
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void landing()
	{
		System.out.println("Plane is landing");
	}
	
}
class CargoPlane extends Plane
{

	public void fly()
	{
		System.out.println("CargoPlane flies at lower hieght");
	}
	
}
class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("PassengerPlane flies at medium height");
	}
	
}
class FighterPlane extends Plane
{
	public void fly()
	{
		System.out.println("Fighter plane flies at high height");
	}
}

class Airport
{
	public void permit(Plane plane)
	{
		plane.takeOff();
		plane.landing();
		plane.fly();
	}
}

public class LaunchPlane {
	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		
		PassengerPlane pp=new PassengerPlane();
		 
		FighterPlane fp=new FighterPlane();
		
		Airport a=new Airport();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		
//		Plane plane;
//		
//		 plane=cp;
//		 plane.takeOff();//1:M
//		 plane.fly();
//		 plane.landing();
//		 
//		 plane=pp;
//		 
//		 plane.takeOff();//1:M
//		 plane.fly();
//		 plane.landing();
		 
		
	
	}

}
