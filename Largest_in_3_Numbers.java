package com.basic.assignment;

import java.util.Scanner;

public class Largest_in_3_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int a= scanner.nextInt();
		System.out.println("Enter number 2 :");
		int b= scanner.nextInt();
		System.out.println("Enter number 3 :");
		int c= scanner.nextInt();
		if(a>=b&&a>=c)
			System.out.println(a+" is the largest number");
		else if(b>=a&&b>=c)
			System.out.println(b+" is the largest number");
		else
			System.out.println(c+" is the largest number");
		

	}

}
