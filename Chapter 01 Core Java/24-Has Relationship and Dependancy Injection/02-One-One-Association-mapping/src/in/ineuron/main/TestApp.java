package in.ineuron.main;

import in.ineuron.bean.Account;
import in.ineuron.bean.Employee;

public class TestApp {

	public static void main(String[] args) {

		Account account = new Account("ABC123", "sachin", "Savings");

		// Constructor Injection
		Employee employee = new Employee("IND10", "sachin", "MI", account);
		employee.getEmployeeDetails();

	}

}
