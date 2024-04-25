package com.save;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CarDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Car c = new Car();
	c.setReg_no("GJ-08-AC-5876");
	c.setBrand("MARUTI");
	c.setModel("2029");
	c.setPrice(4200000);

	Engine e = new Engine();
	e.setEngine_no(451);
	e.setCc(320);
	e.setHp(120);
	e.setType("PETROL");
	
	c.setEngine(e);
	
	et.begin();
	em.persist(c); 
	// When using cascading no need to persist engine
//	em.persist(e); 
	et.commit();
	
	System.out.println("Object Saved .....");
	
	
	
	
	// TO FIND ONE FECORD FROM TABLE---------------------------------------
//	Car c = em.find(Car.class, "GJ-12-DP-2929");
//	if (c!=null) {
//		System.out.println(c);
//	} else {
//		System.out.println("NO RECORDS FOUND ....");
//	}
//	System.out.println("Single Record is Fetched .....");
	
	
	
	
	// TO FIND ALL THE FECORD FROM TABLE-----------------------------------
//	Query q = em.createQuery("select c from Car c");
//	List<Car> car = q.getResultList();
//	for(Car c : car) {
//		System.out.println(c);
//	}
//	System.out.println("ALL Record is Fetched .....");
	
	
	
	// TO UPDATE THE FECORD INSIDE CAR-------------------------------------
//	Query q=em.createQuery("select e from Employee e");
//	List<Employee> emp=q.getResultList();
//	Iterator<Employee> itr=emp.iterator();
//	Employee e=null;
//	while(itr.hasNext())
//	{
//		Employee eml=itr.next();
//		if(eml.getName().equals("man")) {
//			eml.setSal(9000);
//			e=eml;
//			break;
//		}
//	}
//	if(e!=null)
//	{
//		et.begin();
//		em.merge(e);
//		et.commit();
//		System.out.println("Object Updated");
//	}
//	else
//	{
//		System.out.println("No record Found");
//	}

	
	// DELETE
	//Delete...................................................	
	
//			Employee e=em.find(Employee.class, 103);
//			if(e!=null)
//			{
//				et.begin();
//				em.remove(e);
//				et.commit();
//				System.out.println("Record Deleted SuccessFully");
//			}
//			else
//			{
//				System.out.println("NO Record Found............");
//			}

	



}
}
