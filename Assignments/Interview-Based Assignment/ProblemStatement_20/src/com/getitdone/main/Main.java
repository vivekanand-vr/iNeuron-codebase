package com.getitdone.main;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.getitdone.HBUtil.HibernateUtil;
import com.getitdone.model.Student;

public class Main {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Chose the options");
			System.out.println("1-save student.");
			System.out.println("2-update student");
			int op = sc.nextInt();

			
			  if(op==1) { System.out.println("Enter the name"); String name = sc.next();
			  System.out.println("Enter the address"); String address = sc.next();
			  System.out.println("Enter the age"); Integer age = sc.nextInt(); Student
			  st=new Student(); st.setAddress(address); st.setAge(age); st.setName(name);
			  
			  Session session = HibernateUtil.getSession();
			  
			  Transaction transaction = session.beginTransaction();
			  
			  Serializable result = session.save(st);
			  
			  Student str = session.get(Student.class, result);
			  System.out.println("Student saved with the details->"+str);
			  
			  
			  }
			 
			if (op == 2) {
				System.out.println("Enter the student id to update");
				int id = sc.nextInt();
				Session session = HibernateUtil.getSession();
				Transaction transaction = session.beginTransaction();
				Student student = session.get(Student.class, id);
				if (student == null) {
					System.out.println("Student not found.");
				} else {
					if (transaction != null) {
						System.out.println("Name is " + student.getName());
						System.out.println("Enter the name to update");
						String uName = sc.next();
						student.setName(uName);
						System.out.println("Name is " + student.getAddress());
						System.out.println("Enter the address to update");
						String uAddress = sc.next();
						student.setAddress(uAddress);
						System.out.println("Name is " + student.getAge());
						System.out.println("Enter the name to update");
						Integer uAge = sc.nextInt();
						student.setAge(uAge);

						session.update(student);

						Student student2 = session.get(Student.class, student.getId());
						System.out.println(student2 + "updated data");

					}
					session.close();

				}

			}

		}
	}

}
