package com.test.Java_Assignments;

interface L_Demo
{
	void display(int x);
}

public class LambdaExpression_Program {

	public static void main(String[] args) {
		L_Demo d=(x)->System.out.println("This is Lambda expression: "+x);
		d.display(10);

	}

}
