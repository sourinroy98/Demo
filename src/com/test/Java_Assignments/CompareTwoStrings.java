package com.test.Java_Assignments;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st string: ");
		String s = sc.nextLine();
		
		System.out.println("Enter the 2nd string: ");
		String str = sc.nextLine();
		sc.close();
		
		if(s.equals(str))
			System.out.println("Both the strings are equal");
		else {
			System.out.println("Both are not equal");
		}

	}

}
