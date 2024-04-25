package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Reg_no;
	private String name;
	private String university;
	private String address;
	
	public int getReg_no() {
		return Reg_no;
	}
	public void setReg_no(int reg_no) {
		Reg_no = reg_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Collage [Reg_no=" + Reg_no + ", name=" + name + ", university=" + university + ", address=" + address
				+ "]";
	}
		
}
