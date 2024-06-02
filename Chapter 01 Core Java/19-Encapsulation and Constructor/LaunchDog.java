class Dog
{
	private String name;
	private int cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}	
}
public class LaunchDog {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.setName("Sheru");
		System.out.println(d.getName());
		d.setCost(2000);
		int cost=d.getCost();
		System.out.println(cost);
	}

}
