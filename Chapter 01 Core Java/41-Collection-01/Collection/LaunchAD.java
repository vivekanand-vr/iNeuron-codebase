import java.util.ArrayDeque;

public class LaunchAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(30);
		System.out.println(ad);
		ad.addFirst(5);
		ad.addLast(35);
		System.out.println(ad);
		

	}

}
