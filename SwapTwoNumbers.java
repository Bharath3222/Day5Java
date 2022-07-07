package com.basic.assignment;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int a= scanner.nextInt();
		System.out.println("Enter number 2 :");
		int b= scanner.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping b value is "+b);
		System.out.println("After swapping a value is "+a);
	}

}
