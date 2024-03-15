package com.getitdone.main;

import org.hibernate.Session;

import com.getitdone.HBUtil.HibernateUtil;
import com.getitdone.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSession();
		
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		session.close();

	}

}
