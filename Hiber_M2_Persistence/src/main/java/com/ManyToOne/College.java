package com.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	private int Reg_no;
	private String name;
	private double fees;
	private String university;
	
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	@Override
	public String toString() {
		return "College [Reg_no=" + Reg_no + ", name=" + name + ", fees=" + fees + ", university=" + university + "]";
	}
	
	
	
}
