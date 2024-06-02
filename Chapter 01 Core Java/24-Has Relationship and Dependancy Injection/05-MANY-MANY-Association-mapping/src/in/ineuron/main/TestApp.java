package in.ineuron.main;

import in.ineuron.bean.Course;
import in.ineuron.bean.Student;

public class TestApp {

	public static void main(String[] args) {

		Course c1 = new Course("A11", "JAVA", 1000);
		Course c2 = new Course("B11", "Python", 2000);
		Course c3 = new Course("C11", "Blockchain", 3000);

		Course[] course = new Course[3];
		course[0] = c1;
		course[1] = c2;
		course[2] = c3;

		Student s1 = new Student("IND10", "sachin", "MI", course);
		Student s2 = new Student("IND7", "dhoni", "CSK", course);
		Student s3 = new Student("IND18", "kohli", "RCB", course);

		s1.getStudentDetails();
		s2.getStudentDetails();
		s3.getStudentDetails();

	}

}
