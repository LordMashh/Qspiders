package com.save;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Car {
	@Id
	private String reg_no;
	private String brand;
	private String model;
	private double price;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	// we need to cascade carefully because it leads to irregularity
	
	private Engine engine;
	
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [reg_no=" + reg_no + ", brand=" + brand + ", model=" + model + ", price=" + price + ", engine="
				+ engine + "]";
	}
	
	
	
	
}
