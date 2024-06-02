enum Course
{
	JAVA, JEE, SPRINGBOOT, HYDER;
	
	int courseId;
	
	Course()
	{
		System.out.println("Constructor");
	}
	
	void setCourseId(int courseId)
	{
		this.courseId=courseId;
	}
	int getCourseId()
	{
		return courseId;
	}	
}

public class LaunchEnum3 
{
	public static void main(String[] args) 
	{
		Course.JAVA.setCourseId(10);
		
		int cid=Course.JAVA.getCourseId();
		System.out.println(cid);

	}

}
