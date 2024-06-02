import java.util.*;
public class LaunchLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll1=new LinkedList();
		
		ll1.add(10);
		ll1.add("iNeuron");
		ll1.add("iNeuron");
		ll1.add(20);
		System.out.println(ll1);
		
		ll1.addFirst("Hyder Abbas");
		System.out.println(ll1);
		ll1.add(3, "Bengaluru");
		
	    System.out.println(ll1);
	    
	    ll1.addLast("RichMond town");
	    
	    System.out.println(ll1);
	    
	    System.out.println("***************************");
	    
	    LinkedList ll2=new LinkedList();
	    
	    ll2.add(10);
	    ll2.add(20);
	    ll2.add(40);
	    ll2.add(30);
	    ll2.add(40);
	    System.out.println(ll2);
	    
	    
	    System.out.println(ll2.getFirst());
	    System.out.println(ll2.getLast());
	    System.out.println(ll2.indexOf(40));
	    System.out.println(ll2.lastIndexOf(40));
//	    ll2.offerFirst(5);
//	    ll2.offerLast(55);
	    ll2.addFirst(5);
	    ll2.addLast(55);
	    System.out.println(ll2);
	    System.out.println(ll2.peekFirst());
	    System.out.println(ll2);
	    System.out.println(ll2.pollFirst());
	    System.out.println(ll2);
	    
	    

	}

}
