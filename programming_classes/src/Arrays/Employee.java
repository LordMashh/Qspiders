package Arrays;

public class Employee implements Comparable{
	private String name;
	private int salary;
	private String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (this.salary > e.salary) {
			return 1;
		} else if(this.salary < e.salary){
			return -1;
		}
		return 0;
	}
}
