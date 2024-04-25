package com.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// it will automatically geerate value which starts from 1 and increment it by 1
	private int sid;
	private String name;
	private int age;
	private long mob_no;
	
	@CreationTimestamp // it stores the time when data/entity is persisted
	private LocalDateTime reg_time;
	
	@UpdateTimestamp // it stores the time when the data/entity is updated
	private LocalDateTime update_time;
	
	@ManyToOne
	private Collage collage;
	
	public Collage getCollage() {
		return collage;
	}

	public void setCollage(Collage collage) {
		this.collage = collage;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMob_no() {
		return mob_no;
	}

	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}

	public LocalDateTime getReg_time() {
		return reg_time;
	}

	public void setReg_time(LocalDateTime reg_time) {
		this.reg_time = reg_time;
	}

	public LocalDateTime getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(LocalDateTime update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", mob_no=" + mob_no + ", reg_time="
				+ reg_time + ", update_time=" + update_time + ", collage=" + collage + "]";
	}
	
	
}
