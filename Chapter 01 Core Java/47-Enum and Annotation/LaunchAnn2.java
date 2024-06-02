
@interface CricketPlayer
{
	//@ --> its not interface but its Annotation being created
	String country();
	int runs();
}

class ViratKohli
{
	private int innings;
	private String name;
	
	
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class LaunchAnn2 {

	public static void main(String[] args) {
	
         ViratKohli vk=new ViratKohli();
         vk.setInnings(300);
         vk.setName("VK");
         
         System.out.println(vk.getInnings());
         System.out.println(vk.getName());

	}

}
