package com.test.Java_Assignments;

interface Demo
{
	void show();
}
public class AnonyDemo {

	public static void main(String[] args) {
		Demo d = new Demo()
				{
			         public void show() 
			         {
			        	 System.out.println("This in anonymous");
			         }
			
				};
	    d.show();
		
	}

}
