import java.util.*;
class Student
{
	private int age;
	private int marks;
	private String name;
	
	public Student(int age,int marks,String name)
	{
		this.age=age;
		this.marks=marks;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public int getMarks() {
		return marks;
	}
	public String getName() {
		return name;
	}
}
public class LaunchGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(12, 75, "Rahul");
		Student s2=new Student(14, 99, "Sharmaji ka beta");
		Student s3=new Student(12, 75, "Rohan");
		
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		//al.add(100); error
		//al.add("hgfdfgh"); error
		
		System.out.println(al);
		
		
		
		
	}

}
