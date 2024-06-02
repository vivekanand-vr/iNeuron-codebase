package in.ineuron.main;

import in.ineuron.bean.Department;
import in.ineuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) {

		Employee e1 = new Employee("10", "sachin", "MI");
		Employee e2 = new Employee("18", "kohli", "RCB");
		Employee e3 = new Employee("7", "dhon", "CSK");

		Employee[] emps = new Employee[3];
		emps[0] = e1;
		emps[1] = e2;
		emps[2] = e3;

		// Constructor Injection
		Department department = new Department("IPL16", "BCCI", emps);
		department.getDepartmentDetails();
	}

}
