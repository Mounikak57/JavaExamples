package com.hibernate.demo.FirstLevelCache.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.FirstLevelCache.model.Student;

public class Client {
	public static void main(String[] args) {
		// create container
		Configuration cfg = new Configuration();
		// cfg.configure("resources/hibernate.cfg.xml");
		// start container
		SessionFactory sf = new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		// SessionFactory sf = cfg.buildSessionFactory();// connections will create
		Session session = sf.openSession();

		System.out.println("using first session");
		Student st1 = (Student) session.get(Student.class, 10);
		System.out.println(st1.getName());
		System.out.println(st1.getEmail());

		Student st2 = (Student) session.get(Student.class, 10);//wont fire any query
		System.out.println(st2.getName());
		System.out.println(st2.getEmail());

		System.out.println("using second session");
		Session session2 = sf.openSession();
		Student st3 = (Student) session2.get(Student.class, 10);

		System.out.println(st3.getName());
		System.out.println(st3.getEmail());
	}
}
