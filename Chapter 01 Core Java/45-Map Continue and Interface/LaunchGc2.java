
import java.util.*;
class Employee1
{
	private int empid;
	private String name;
	private String empAddr;
	
	@Override
	public String toString()
	{
		return "hyder";
	}
	
	@Override
	public void finalize()
	{
		System.out.println("Garbage Collector collected the object");
	}
	//setter
	//getters
}
public class LaunchGc2
{
	public static void main(String[] args) throws Exception
	{
		
		Employee e=new Employee();
		WeakHashMap hm=new WeakHashMap();
		hm.put(e, "Hyder");
		System.out.println(hm);
		//Statements
		//Statements
		e=null; //eleigible for garbage collection
		System.gc();//call to GC
		Thread.sleep(4000);
		System.out.println(hm);
		
		
		
	}

}

