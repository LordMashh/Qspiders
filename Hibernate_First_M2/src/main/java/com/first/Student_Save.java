package com.first;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_Save {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/first/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();
		
		Student p = new Student();
		p.setSid(102);
		p.setName("manoj");
		p.setAge(21);
		p.setGender('m');
		p.setMobno(9026343655l);
		
		
		s.save(p);
		trx.commit();
		System.out.println("Object Saved ......");
	}
}
