package com.ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student1")
public class Student1 {
	@Id
	private int sid;
	private String name;
	private long mob_no;
	private int age;
	@ManyToOne
	//@ManyToOne(cascade = CascadeType.REMOVE)
//	@ManyToOne(cascade = CascadeType.PERSIST)
	private College college;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", mob_no=" + mob_no + ", age=" + age + ", college=" + college
				+ "]";
	}
	
	
	
}
