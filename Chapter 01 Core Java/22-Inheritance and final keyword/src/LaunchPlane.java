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
	public void carryGoods()
	{
		System.out.println("cargoPlane carries goods");
	}
}
class PassengerPlane extends Plane
{
	public void fly()
	{
		System.out.println("PassengerPlane flies at medium height");
	}
	public void carryPassenger()
	{
		System.out.println("PassengerPlane carries passengers");
	}
}




public class LaunchPlane {

	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		
		cp.takeOff();//inherited method
		cp.carryGoods();//specialzed method
		cp.fly();//overridden method
		cp.landing();// inherited method
		
		pp.takeOff();
		pp.carryPassenger();
		pp.fly();
		pp.landing();
	}

}
