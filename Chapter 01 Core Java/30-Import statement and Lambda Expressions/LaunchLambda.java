
//
@FunctionalInterface
interface Add
{
	void add(int a, int b);
}
@FunctionalInterface
interface Sub
{
	int sub(int num1);
}

// to write lambda exp we use lambda operator (->)
// lambda operator divided into 2 parts to writw lambda exp
// left side of lambda operator we write parameters required
//right side of lambda operator we write body or implementation
// left side for parameters datatype is optional
// write side if implementation or body has one statement then {} is optional
// left side if parameter is single then () and type of data both optional
// write side in body if its single line implementaion then return statement is also optional
// {} is mandtaory if there are more then one statement and also if there is return statement explictly used by developer
public class LaunchLambda {

	public static void main(String[] args) 
	{
		Add add= (a, b)->{
			int res=a+b;
			System.out.println(res);
		};
		
		add.add(10, 20);
		
//		Sub sub=  num1->{
//			int res=num1-5;
//			return res;
//		};
//		Sub sub= num1 -> { 
//			return num1-5;
//		};
		Sub sub= num1 -> num1-5;
            
		
	}

}
