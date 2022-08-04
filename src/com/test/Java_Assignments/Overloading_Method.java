package com.test.Java_Assignments;


public class Overloading_Method {
	
	public void show()
	{
		System.out.println("This is no-arguement method");
	}
	
	public void show(int x)
	{
		System.out.println("This is int-arguement method");
	}

	public static void main(String[] args) 
	{
           Overloading_Method obj = new Overloading_Method();
           obj.show();
           obj.show(30);


	}

}
