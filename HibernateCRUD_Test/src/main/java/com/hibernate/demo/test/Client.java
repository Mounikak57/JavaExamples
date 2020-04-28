package com.hibernate.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.model.Employee;

public class Client {
	public static void main(String[] args) {
		// create container
		Configuration cfg = new Configuration();
		// cfg.configure("resources/hibernate.cfg.xml");
		// start container
		SessionFactory sf = new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		// SessionFactory sf = cfg.buildSessionFactory();// connections will create
		Session session = sf.openSession();
		Employee emp1 = new Employee();
		emp1.setId(111);
		emp1.setName("naveen");
		emp1.setEmail("naveen@gmail.com");

		Employee emp2 = new Employee();
		emp2.setId(222);
		emp2.setName("ajay");
		emp2.setEmail("ajay@gmail.com");

		Employee emp3 = new Employee();
		emp3.setId(333);
		emp3.setName("anil");
		emp3.setEmail("anil@gmail.com");

		int i1 = (Integer) session.save(emp1);
		int i2 = (Integer) session.save(emp2);
		int i3 = (Integer) session.save(emp3);

		session.beginTransaction().commit();
		session.close();
		sf.close();
		System.out.println("Success");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}
}
