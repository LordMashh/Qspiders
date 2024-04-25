//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class BankDriver {
//	private static EntityManagerFactory emf;
//	private static EntityManager em;
//
//	public static void main(String[] args) {
//		try {
//			initializeEntityManager();
//			createBankAndAccounts();
//			// Uncomment the operations you want to perform
//			// readBank();
//			// updateBank();
//			// deleteBank();
//            updateAccountByMobileNumber(9856325698L, "Mayank"); // Example usage
//
//		} finally {
//			closeEntityManager();
//		}
//	}
//
//	private static void initializeEntityManager() {
//		emf = Persistence.createEntityManagerFactory("amit");
//		em = emf.createEntityManager();
//	}
//
//	private static void closeEntityManager() {
//		if (em != null) {
//			em.close();
//		}
//		if (emf != null) {
//			emf.close();
//		}
//	}
//
//	private static void createBankAndAccounts() {
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//
//		Bank bank = new Bank();
//		bank.setIfsc("SBIN0000101");
//		bank.setName("SBI BANK");
//		bank.setAddress("Navarangura");
//
//		Account account1 = new Account();
//		account1.setAcc_no(397982266);
//		account1.setAcc_holder_name("Sunny Jha");
//		account1.setMob_no(9856325698L);
//
//		Account account2 = new Account();
//		account2.setAcc_no(39227803);
//		account2.setAcc_holder_name("Komal");
//		account2.setMob_no(9856985632L);
//
//		Account account3 = new Account();
//		account3.setAcc_no(666301562);
//		account3.setAcc_holder_name("Ayush");
//		account3.setMob_no(7758465478L);
//
//		bank.setAccount(Arrays.asList(account1, account2, account3));
//
//		em.persist(bank);
//		et.commit();
//	}
//
//	private static void readBank() {
//		Bank bank = em.find(Bank.class, "SBIN0000101"); // Assuming IFSC is the primary key
//		System.out.println("Bank Details:");
//		System.out.println("IFSC: " + bank.getIfsc());
//		System.out.println("Name: " + bank.getName());
//		System.out.println("Address: " + bank.getAddress());
//		System.out.println("Accounts:");
//		for (Account account : bank.getAccount()) {
//			System.out.println("Account Number: " + account.getAcc_no());
//			System.out.println("Account Holder Name: " + account.getAcc_holder_name());
//			System.out.println("Mobile Number: " + account.getMob_no());
//		}
//	}
//
//	private static void updateBank() {
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//
//		Bank bank = em.find(Bank.class, "SBIN0000101"); // Assuming IFSC is the primary key
//		bank.setName("State Bank of India");
//		// Perform any other updates as needed
//
//		et.commit();
//	}
//
//	private static void deleteBank() {
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//
//		Bank bank = em.find(Bank.class, "SBIN0000101"); // Assuming IFSC is the primary key
//		em.remove(bank);
//
//		et.commit();
//	}
//
//	private static void updateAccountByMobileNumber(long mobileNumber, String newHolderName) {
////        EntityTransaction et = em.getTransaction();
////        try {
////            et.begin();
////
////            Query query = em.createQuery("SELECT a FROM Account a WHERE a.mob_no = :mobileNumber");
////            query.setParameter("mobileNumber", mobileNumber);
////
////            Account account = (Account) query.getSingleResult();
////            account.setAcc_holder_name(newHolderName);
////
////            et.commit();
////
////            System.out.println("Account updated successfully.");
////        } catch (Exception e) {
////            if (et != null && et.isActive()) {
////                et.rollback();
////            }
////            System.err.println("Error updating account: " + e.getMessage());
////        }
//		Query q = em.createQuery("Select b from Bank b");
//		List<Bank> = q.getResultList();
//		
//	}
//}
package com.save;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BankDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bank b = new Bank();
		b.setIfsc("SBIN0000101");
		b.setName("SBI BANK");
		b.setAddress("Navarangura");

		Account a1 = new Account();
		a1.setAcc_no(397982266);
		a1.setAcc_holder_name("Sunny Jha");
		a1.setMob_no(9856325698l);

		Account a2 = new Account();
		a2.setAcc_no(392278043);
		a2.setAcc_holder_name("Komal");
		a2.setMob_no(9856985632l);

		Account a3 = new Account();
		a3.setAcc_no(874521458);
		a3.setAcc_holder_name("Ram");
		a3.setMob_no(7758465478l);

		List<Account> account = new ArrayList<Account>();
		account.add(a1);
		account.add(a2);
		account.add(a3);

		b.setAccount(account);

		et.begin();
		em.persist(b);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		et.commit();

		System.out.println("Object is saved .....");
		
		// 1) program to update account table record using mobile number.
//		Query q = em.createQuery("select b from Bank b");
//		List<Bank> bank = q.getResultList();
//		System.out.println(bank);
//		for (Bank b : bank) {
//			List<Account> account = b.getAccount();
//			Account a = null;
//			Iterator<Account> itr = account.iterator();
//			while(itr.hasNext()) {
//				a= itr.next();
//				long mob = a.getMob_no();
//				if(mob == 9856985632l) {
//					a.setAcc_holder_name("Dhaval");
//					break;
//				}
//			}
//			et.begin();
//			em.merge(a);
//			et.commit();
//		}
//		
		//2) program to delete account from bank entity using Acc_number
//		Account a =em.find(Account.class, 397982266);
//		if(a!=null)
//		{
//			et.begin();
//			em.remove(a);
//			et.commit();
//			System.out.println("Record Deleted SuccessFully");
//		}
//		else
//		{
//			System.out.println("NO Record Found............");
//		}
//		Bank b = em.find(Bank.class, "SBIN0000101");
//		List<Account> account = b.getAccount();
//		Account a = null;
//		for (Account acc : account) {
//			if(acc.getAcc_no() == 39227803) {
//				a = acc;
//				break;
//			}
// 		}
//		account.remove(a);
//		et.begin();
//		em.remove(a);
//		em.merge(b);
//		et.commit();
		
		//3) program to delete a bank along with all accounts
//		Bank b = em.find(Bank.class, "SBIN0000101");
//		List<Account> account = b.getAccount();
//		et.begin();
//		for (Account acc : account) {
//				em.remove(acc);
// 		}
//		em.remove(b);
//		et.commit();

	}
}