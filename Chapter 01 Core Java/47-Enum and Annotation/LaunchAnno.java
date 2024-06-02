// Annotation  java 5

//@CricketPlayer
//class Virat
//{
//	
//}

//Annotation --> Annotation --> parent of all Annotations
//Annotation ---> Built in 
//           ----> Custome (our Own)


// Annotation --> 
 //1) class
//2) interface
//3) method
// 4) fields // instance var 
//5 ) local variables
// 6) Consrtuctor 
// 7) Parameters
// 8) enum




@FunctionalInterface
interface Trial
{
	int getNum();
	//void disp();
}

class JavaLearning
{
	public void disp1()
	{
		System.out.println("Parent disp");
	}
}

class Focus extends JavaLearning
{
	@Override
	public void disp1()
	{
		System.out.println("Focus is key");
	}
}



public class LaunchAnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Trial t= ()->
		{
			return 10;
		};
		
		

	}

}
