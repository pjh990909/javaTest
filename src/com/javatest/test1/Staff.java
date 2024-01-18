package com.javatest.test1;

public class Staff extends User{
	
	private int salary;

	public Staff() {
		super();
	}

	public Staff(String id,String ps,String name,int salary) {
		super(id,ps,name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}
	
	public void showInfo() {
		System.out.println("아이디:" + getId() + "\t비번:" + getPw() + "\t이름:" + getName() + "\t월급:" + this.salary);
	}

}
