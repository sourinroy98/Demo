package com.test.Java_Assignments;

import java.util.Scanner;

public class ConditionalSwitchStatement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		int a = s.nextInt();
		
		System.out.println("Enter 2nd number: ");
		int b = s.nextInt();
		
		System.out.println("Select the symbol (+,-,*,/)");
		String symbol = s.next();
		s.close();
		
		int res;
		
		switch (symbol) {
		case "+": res = a+b;
		          System.out.println("Addition is: "+res);
		          break;
		          
		case "-": res = a-b;
                  System.out.println("Subtraction is: "+res);
                  break; 
                  
		case "*": res = a*b;
                  System.out.println("Multiplication is: "+res);
                  break;
                  
		case "/": res = a/b;
                  System.out.println("Division is: "+res);
                  break;
                  
		default:
			throw new IllegalArgumentException("Unexpected value: " + symbol);
		}
		

	}

}
