package com.save;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
 @Id
 private int engine_no;
 private int cc;
 private double hp;
 private String type;
 
 public int getEngine_no() {
	return engine_no;
}
public void setEngine_no(int engine_no) {
	this.engine_no = engine_no;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public double getHp() {
	return hp;
}
public void setHp(double hp) {
	this.hp = hp;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Engine [engine_no=" + engine_no + ", cc=" + cc + ", hp=" + hp + ", type=" + type + "]";
}

 
}
