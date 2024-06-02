// WAP to compute length of String
@FunctionalInterface
interface CLS
{
	int getLength(String str);
}

//#1
//class LOS implements CLS
//{
//	public int getLength(String str)
//	{
//		int length=str.length();
//		return length;
//	}
//}

public class LaunchLambda2 {

	public static void main(String[] args) 
	{
//		LOS l=new LOS();
//		System.out.println(l.getLength("iNeuron.ai"));
		
//		CLS cls=new CLS() {
//			
//			public int getLength(String str)
//			{
//				return str.length();
//			}
//		};
//		System.out.println(cls.getLength("iNeuron.ai"));
		
		CLS cls= str -> str.length();
		
		System.out.println(cls.getLength("iNeuron.ai"));

	}

}
