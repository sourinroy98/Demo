package com.test.Java_Assignments;

import java.util.Scanner;

public class Casting_Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int a=sc.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int b=sc.nextInt();
		
		sc.close();
		
		int c = a + b;
		double d = (double)a / b;
		
		
		System.out.println("Sum of the two number is: "+(double)c);

		System.out.println("Division of the two number is: "+d);
	}

}
