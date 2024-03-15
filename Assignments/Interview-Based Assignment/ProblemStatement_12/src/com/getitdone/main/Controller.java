package com.getitdone.main;

import java.util.Scanner;

import com.getitdone.model.Student;
import com.getitdone.service.IStudentService;
import com.getitdone.service.StudentServiceImpl;

public class Controller {

	public static void main(String[] args) {
		
		
		IStudentService service=new StudentServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to save student");
		System.out.println("press 2 to search student");
		System.out.println("press 3 to update student");
		System.out.println("press 4 to delete student");
		
		int option = sc.nextInt();
		if(option==1) {
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the address");
			String address=sc.next();
			System.out.println("Enter the age");
			int age = sc.nextInt();
			
		    Student student=new Student(name,address,age);
			String result = service.save(student);
			System.out.println(result);
			
		}
		else if(option==2) {
			
			System.out.println("Enter id to search student");
			int id1 = sc.nextInt();
			Student byId = service.getById(id1);
			if(byId!=null) {
				System.out.println(byId);
			}else {
				System.out.println("Student record not found");
			}
	
		}
		else if(option==3) {
			System.out.println("Enter the name to be updated");
			String name = sc.next();
			System.out.println("Enter the address to be updated");
			String address=sc.next();
			System.out.println("Enter the age to be updated");
			int age = sc.nextInt();
			System.out.println("Enter the id to be updated");
			int id=sc.nextInt();
			
			Student student=new Student(id,name,address,age);
			Student update = service.update(student);
			if(update!=null) {
				System.out.println("Student updated successfully by id"+update.getId());
			}else {
				System.out.println("Student record not found");
			}
		}
		else if(option==4) {
			System.out.println("Enter id to delete student");
			int id2 = sc.nextInt();
			String result = service.deleteById(id2);
			System.out.println(result);
		}
		else {
			System.out.println("Invalid option");
		}
		
		
		
		

	}

}
