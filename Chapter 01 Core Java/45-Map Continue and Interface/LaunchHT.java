import java.util.*;

class Ineuron
{
	int i;
	public Ineuron(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return i+ "";
	}
	
}

public class LaunchHT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable ht=new Hashtable();
		ht.put(11, "Hyder");
		ht.put(12, "Nitin");
		System.out.println(ht);
		
		Hashtable ht2=new Hashtable();
		ht2.put(new Ineuron(11), "Hyder");
		ht2.put(new Ineuron(12), "Nitin");
		ht2.put(new Ineuron(13), "Navin reddy");
		
		System.out.println(ht2);
		
		
		/// equals();  HashMap
		///==:  IdentityHashMap
		
		
		
		
		
		
		
		
		//Hashtable java1.0
		//HashMap java 1.2
		
		//Hashtable - synchronized (Multithreading not possible
		//HashMap - non synchronized (Multithreading possible
		
		//Hashtable - Thread safe
		//HashMap - not safe
		
		//Hashtable - Low performance
		//HashMap - High performance
	}

}
