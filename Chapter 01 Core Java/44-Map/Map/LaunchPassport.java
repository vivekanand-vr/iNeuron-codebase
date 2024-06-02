import java.util.*;
import java.util.Map.Entry;
class Information
{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	public Information(String name , int age, String fatherName, String city)
	{
		this.name=name;
		this.age=age;
		this.fatherName=fatherName;
		this.city=city;
		
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getFatherName() {
		return fatherName;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString()
	{
		return name + " " + age + " " + fatherName + " " + city;
	}
}
//class Key {
//	int key;
//	public Key(int key)
//	{
//		this.key=key;
//	}
//}

public class LaunchPassport 
{
	public static void main(String[] args) 
	{
		Information info1= new Information("Rohan Sharma", 18, "Sharmaji", "Delhi");
		Information info2= new Information("Hyder Abbas", 28, "Hussain Najafi", "Bengalauru");
		Information info3= new Information("Nitin M", 29, "Manjunath", "Bengalauru");
//		Key k=new Key(123);
		
		HashMap hm=new HashMap();
		hm.put(000, info1);
		hm.put(111, info2);
		hm.put(333, info3);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry passport=(Entry) itr.next();
			System.out.println("Passport Number : "+ passport.getKey() + " : Info : "+ passport.getValue());
		}
		
	}

}
