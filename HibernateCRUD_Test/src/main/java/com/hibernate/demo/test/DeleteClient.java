package com.hibernate.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.model.Employee;

public class DeleteClient {
	public static void main(String[] args) {
		// create container
		Configuration cfg = new Configuration();
		// cfg.configure("resources/hibernate.cfg.xml");
		// start container
		SessionFactory sf = new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		// get Session
		Session session = sf.openSession();

		Employee emp1 = new Employee();
		emp1.setId(111);
		session.delete(emp1);

		session.beginTransaction().commit();
		session.close();
		System.out.println("Delete Success");
	}
}
