package com.test.Java_Assignments;

import java.util.Scanner;

public class Multidimentional_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int row=sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int col=sc.nextInt();
		
		int[][] arr=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("arr["+i+"]["+j+"] =");
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		
	    System.out.println("Multidimentional array is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
