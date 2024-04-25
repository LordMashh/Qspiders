package com.save;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bank_details")
public class Bank {
	@Id
	private String ifsc;
	private String name;
	private String address;
	
	@OneToMany
	private List<Account> account;
//	private Account[] account;    Array

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Bank [ifsc=" + ifsc + ", name=" + name + ", address=" + address + ", account=" + account + "]";
	}
	
	
	
}
