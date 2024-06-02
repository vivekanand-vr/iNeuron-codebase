import java.util.*;
import java.util.Map.Entry;
class Student1
{
	private String name;
	private int age;
	private String city;
	
	public Student1(String name, int age, String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString()
	{
		return name + " " +age + " " + city ;
	}
}
public class LaunchMapsCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 st1=new Student1("Rohan", 18, "Mumbai");
		Student1 st2=new Student1("Rahul", 18, "Bengaluru");
		Student1 st3=new Student1("Rohan", 19, "Delhi");
		
		
		HashMap hm=new HashMap();
		hm.put(1, st1);
		hm.put(2, st2);
		hm.put(3, st3);
		
		System.out.println(hm);
		
		//view
		
		//entryset
		
		Collection col=hm.values();
		Iterator itr=col.iterator();
		while(itr.hasNext())
		{
			System.out.println("value of Student : "+ itr.next());
		}
		
		System.out.println("**********************");
		
		Set set=hm.keySet();
		
		    Iterator itr2=set.iterator();
		  
			while(itr2.hasNext())
			{
				System.out.println("Key of Student : "+ itr2.next());
			}
			System.out.println("********************");
			Set bothData=hm.entrySet();
			Iterator itr3=bothData.iterator();
			
			while(itr3.hasNext())
			{
				Map.Entry data=(Entry) itr3.next();
				System.out.println(data.getKey() + " : " + data.getValue());
			}
		

	}

}
