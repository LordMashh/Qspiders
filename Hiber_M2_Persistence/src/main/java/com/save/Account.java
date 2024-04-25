package com.save;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")

public class Account {
	@Id
	@Column(name = "account_number")
	private int acc_no;
	@Column(name = "account_holder_name")
	private String acc_holder_name;
	private long mob_no;
	
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getAcc_holder_name() {
		return acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}
	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", acc_holder_name=" + acc_holder_name + ", mob_no=" + mob_no + "]";
	}
		
}
