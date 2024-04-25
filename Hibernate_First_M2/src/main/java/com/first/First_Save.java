package com.first;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class First_Save {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("com/first/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();
		
		Product p = new Product();
		p.setPid(105);
		p.setName("Mouse");
		p.setPrice(550);
		
		s.save(p);
		trx.commit();
		System.out.println("Object Saved ......");
	}
}
