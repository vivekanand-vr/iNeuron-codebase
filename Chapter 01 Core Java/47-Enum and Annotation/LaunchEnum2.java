
enum Result
{
	PASS, FAIL, NR; //static final
	
	//PASS --> public static final Result PASS=new Result();
	//FAIL --> static final Result FAIL =new Result();
	//NR ---> static final Result NR=new Result();
	
	 Result()
	{
		System.out.println("Constructor is called");
	}
}


public class LaunchEnum2 
{

	public static void main(String[] args)
	{
	    Result res=Result.PASS;
	    System.out.println(res);
	    
	    Result resArr[]=Result.FAIL.values();
	    
	    for(Result haider:resArr)
	    {
	    	System.out.println(haider.ordinal() + " : " + haider.name());
	    }
	    

	}

}
