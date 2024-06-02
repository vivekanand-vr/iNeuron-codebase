//UncheckedException --> Compiler will not force us to handle(It will not be checked during compile time)
//CheckedException--> it will be checked by compiler 
public class LaunchException5 {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println("Before sleepn");
		Thread.sleep(4000);
		System.out.println("after the nap");

	}

}
