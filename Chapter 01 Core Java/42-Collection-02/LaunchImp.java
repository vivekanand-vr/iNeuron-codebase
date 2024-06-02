import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class LaunchImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10); // al.add(new Integer(10));
		al.add(10.5);//al.add(new Double(10.5));
		al.add('c');//al.add(new Character('c'));
		al.add(10.5f);// auto boxing
		//System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		System.out.println(al2);//
		//diff ways to access data present within collection
		//loop normal
		System.out.println(al2.size());
		for(int i=0;i<al2.size();i++)
		{
//			Object o=al2.get(i);
//			System.out.println(0);
			System.out.print(al2.get(i)+ " ");
		}
		System.out.println();
		//for each
		for(Object obj:al2)
		{
			System.out.print(obj+ " ");
		}
		System.out.println("*************");
		// iterator
		
		Iterator itr1=al2.iterator();
		
//		if(itr1.hasNext()==true)
//		{
//				itr1.next();
//		}
	
		while(itr1.hasNext())
		{
//			Integer i=(Integer) itr1.next();
			//Object o=itr1.next();
			System.out.println(itr1.next());
			
		}
		System.out.println("reverse");
		
		ListIterator litr = al2.listIterator(al2.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		// what if I want to reverse or access data of other claases in reverse dir?
		
		
		TreeSet ad=new TreeSet();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		Iterator it=ad.iterator();
		
		while(it.hasNext()==true)
		{
			Integer i=(Integer) it.next();
			System.out.println("Array De" + i);
		}
		
		System.out.println("added linked list");
		LinkedList ll=new LinkedList();
		ll.addAll(ad);
		System.out.println(ll);
		
		ListIterator litr2=ll.listIterator(ll.size());
		System.out.println("Accessing treeset data in reverse");
		while(litr2.hasPrevious())
		{
			System.out.println(litr2.previous());
			
		}
		
		
		
	
		
		
	
		
	}

}
