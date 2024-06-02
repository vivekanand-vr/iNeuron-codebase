import java.util.*;
public class LaunchCollections {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// 100 50 150 25 75 125 175
		
		 TreeSet ts=new TreeSet();
		 
		 ts.add(100);
		 ts.add(50);
		 ts.add(150);
		 ts.add(25);
		 ts.add(75);
		 ts.add(125);
		 ts.add(175);
		 
		 System.out.println(ts);
		 
		 ArrayList al=new ArrayList();
		 al.add(100);
		 al.add(50);
		 al.add(150);
		 al.add(25);
		 al.add(75);
		 al.add(125);
		 al.add(175);
		 System.out.println(al);
		 
		 //Collection vs Collections
		 
		 Collections.sort(al);
		 
		 System.out.println(al);
		 
		 ArrayList<String> al2=new ArrayList<String>();
		// al2.add(28); error
		 al2.add("Hyder");
		 al2.add("ineuron");
		 al2.add("Najafi code");
		//error al2.add(560025);
		 
		 Collections.sort(al2);
		 System.out.println(al2);
		 
		 ArrayList<Integer> al3=new ArrayList<Integer>();
		 al3.add(1000);
		 al3.add(200);
		// al3.add("GF"); error
		 Collections.sort(al3);
		 System.out.println(al3);
		 
		 //few more important inbuit methods of Collections class
		 
		 ArrayList al4=new ArrayList();
		 al4.add(10);
		 al4.add(20);
		 al4.add(30);
		 al4.add(40);
		 al4.add(50);
		int index= Collections.binarySearch(al4, 40);
		System.out.println("Index " + index);
		
		Collections.shuffle(al4);
		System.out.println(al4);
		
		System.out.println(Collections.frequency(al4, 40));
		 
	}

}
