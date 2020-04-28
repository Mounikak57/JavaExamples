package com.hibernate.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.model.Employee;

public class UpdateClient {
	public static void main(String[] args) {
		// create container
		Configuration cfg = new Configuration();
		// cfg.configure("resources/hibernate.cfg.xml");
		// start container
		SessionFactory sf = new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		// get Session
		Session session = sf.openSession();
		Employee emp2 = new Employee();
		emp2.setId(222);
		emp2.setName("amar");
		emp2.setEmail("amar@yahoo.com");
		session.update(emp2);

		session.beginTransaction().commit();
		session.close();
		System.out.println("update Success");
	}
}
