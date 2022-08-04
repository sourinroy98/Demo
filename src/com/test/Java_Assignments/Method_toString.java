package com.test.Java_Assignments;

class Employee
{
	int m_ID;
	String name;
	String designation;
	Employee(int m_ID,String name,String designation) {
		this.m_ID=m_ID;
		this.name = name;
		this.designation=designation;
	}
	public String toString() {
		return m_ID+" "+name+" "+designation;
	}
}

public class Method_toString {

	public static void main(String[] args) {
		Employee em = new Employee(1,"Parida","Mentor");
		Employee em1 = new Employee(2,"Sourin","Engineer");
		System.out.println(em.toString());
	
		System.out.println(em1.toString());
	}

}
