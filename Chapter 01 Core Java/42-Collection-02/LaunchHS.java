import java.util.*;
public class LaunchHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(125);
		System.out.println(hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(150);
		lhs.add(25);
		lhs.add(125);
		System.out.println(lhs);
	}

}
