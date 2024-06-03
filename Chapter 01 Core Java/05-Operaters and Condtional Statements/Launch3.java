
public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int a=8; int b=2;
		 * 
		 * if(a>b) { if(a==10) { System.out.println("Subtraction");
		 * System.out.println(a-b); } else {
		 * System.out.println("A is greater but not equal to 10"); } } else if(a==b) {
		 * System.out.println("Addition"); System.out.println(a+b); } else if(a<b) {
		 * System.out.println("a is lesser"); } else {
		 * 
		 * }
		 */
		
		/*
		 * int a=10; int b=20; int c=5;
		 * 
		 * if(a<b) { if(a<c) { System.out.println("A is the least "+a); }
		 * 
		 * else { System.out.println("C is the least"+c); } } else if(b<c) {
		 * System.out.println("B is least" +b); } else {
		 * System.out.println("C is least"+ c);
		 * 
		 * }
		 */
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a<b && a==b)
		{
			System.out.println("A is least");
		}
		else if(b<c && b==a)
		{
			System.out.println("B is least");
		}
		else if(c <a && c<b)
		{
			System.out.println("else block last block");
		}
		else
		{
			System.out.println("Last block");
		}
		
	}

}
