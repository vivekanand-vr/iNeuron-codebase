import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class LaunchFFFS {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
//		for(int i=0 ;i<al.size();i++)
//		{
//			System.out.println(al.get(i));
//			al.add(10);
//		}
		
		//Fail Fast
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//al.add(123);
		}
		
		//Failsafe
		
		CopyOnWriteArrayList cal=new CopyOnWriteArrayList();
		
		cal.add(1000);
		cal.add(2000);
		cal.add(3000);
		cal.add(4000);
	    
		
		Iterator itrr=cal.iterator();
		while(itrr.hasNext())
		{
			System.out.println(itrr.next());
			cal.add(12345);
		}
		

	}

}
