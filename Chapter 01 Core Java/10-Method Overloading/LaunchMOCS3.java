
class Calculator5
{	
	
	float add(float a, int b)
	{
		return a+b;
	}
	
	float add(int c, float a)
	{
		return a+c;
	}
}
public class LaunchMOCS3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator5 cal=new Calculator5();
    cal.add(10, 20);
	}

}
