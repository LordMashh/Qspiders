package com.save;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmpSave {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Employee e = new Employee();
	e.setEmpId(102);
	e.setName("Russimdndnan");
	e.setSalary(60000);
	
	et.begin();
	em.persist(e);
	et.commit();
	
	System.out.println("Object saved .....");
	
}
}
