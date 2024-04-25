package com.ManyToOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CollegeDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
//	College c = new College();
//	c.setReg_no(420);
//	c.setName("Silver OAK");
//	c.setFees(150);
//	c.setUniversity("SOU");
//	
//	Student1 s = new Student1();
//	s.setSid(101);
//	s.setName("Bhupendra Patel");
//	s.setAge(50);
//	s.setMob_no(4204204201l);
//	s.setCollege(c);
//	
//	Student1 s1 = new Student1();
//	s1.setSid(102);
//	s1.setName("Narendra modi");
//	s1.setAge(17);
//	s1.setMob_no(4204204202l);
//	s1.setCollege(c);
//	
//	Student1 s2 = new Student1();
//	s2.setSid(103);
//	s2.setName("Amit Shah");
//	s2.setAge(55);
//	s2.setMob_no(4204204203l);
//	s2.setCollege(c);
//	
//	Student1 s3 = new Student1();
//	s3.setSid(104);
//	s3.setName("Arbind Kejriwal");
//	s3.setAge(45);
//	s3.setMob_no(4204204204l);
//	s3.setCollege(c);
//	
//	List<Student1> account = new ArrayList<Student1>();
//	account.add(s1);
//	account.add(s2);
//	account.add(s3);
//	
//	et.begin();
//	em.persist(s1);
//	em.persist(s2);
//	em.persist(s3);
//	em.persist(c);
//	et.commit();
//	System.out.println("All Students data are saved successfully...");
	
	// TO FIND ONE FECORD FROM TABLE---------------------------------------
//	Student1 s = em.find(Student1.class, 102);
//	if (s!=null) {
//		System.out.println(s);
//	} else {
//		System.out.println("NO RECORDS FOUND ....");
//	}
//	System.out.println("Single Record is Fetched .....");
//	
//	// TO FIND ALL THE RECORD THAT A HAS ITS STARTING LETTER FROM TABLE-----------------------------------
//		Query q = em.createQuery("Select s from Student1 s");
//		System.out.println("thi is c"+q);
//		List<Student1> stud = q.getResultList();
//		for(Student1 s : stud) {
//			System.out.println(s);
//			if (s.getName().charAt(0) == 'A') {
//				System.out.println(s);	
//			}
//		}
//		System.out.println("Record is Fetched .....");
	
//	2) WAP list of students title ends with shah 
//	Query q = em.createQuery("Select s from Student1 s");
////	System.out.println("thi is c"+q);
//	List<Student1> stud = q.getResultList();
//	for(Student1 s : stud) {
////		System.out.println(s);
//		if (s.getName().endsWith("Shah")) {
//			System.out.println(s);	
//		}
//	}
//	System.out.println("Record is Fetched .....");
	
	// TO UPDATE THE RECORD -------------------------------------
	Query q1 = em.createQuery("Select s from Student1 s");
	List<Student1> bank = q1.getResultList();
	System.out.println(bank);
	for (Student1 b : bank) {
		List<Student1> account = b.g;
		Account a = null;
		Iterator<Account> itr = account.iterator();
		while(itr.hasNext()) {
			a= itr.next();
			long mob = a.getMob_no();
			if(mob == 9856985632l) {
				a.setAcc_holder_name("Dhaval");
				break;
			}
		}
		et.begin();
		em.merge(a);
		et.commit();
	}

	
	//Delete...................................................	
//	Student1 e=em.find(Student1.class, 102);
//	if(e!=null)
//	{
//		et.begin();
//		em.remove(e);
//		et.commit();
//		System.out.println("Record Deleted SuccessFully");
//	}
//	else
//	{
//		System.out.println("NO Record Found............");
//	}
	
}

}
