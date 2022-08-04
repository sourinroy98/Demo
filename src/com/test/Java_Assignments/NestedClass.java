package com.test.Java_Assignments;

class Outer
{
	static int x=10;
	private int y = 20;
	class InnerDemo
	{
		void display() {
			System.out.println("Value of x: "+x);
			System.out.println("Value of y: "+y);
		}
	}
}
public class NestedClass {

	

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		Outer.InnerDemo obj1 = obj.new InnerDemo();
		obj1.display();
		

	}

}
