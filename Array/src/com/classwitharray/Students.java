package com.classwitharray;

public class Students {
	private String name;
	private int id;
	private String add;
	public Students(String name,int id,String add){
		this.name=name;
		this.id=id;
		this.add=add;
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return id;
	}
	public String getAdd() {
		return add;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
     public void setId(int id) {
    	 this.id=id;
		
	}

public void setAdd(String add) {
	
	this.add=add;
	
}
	
	

}
