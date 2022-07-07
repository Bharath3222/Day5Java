package com.basic.assignment;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number to find whether it's even or odd");
		int number = scanner.nextInt();
		if(number%2==0)
		System.out.println("You entered number is :"+number+"  and it is even number ");
		else
		System.out.println("You entered number is :"+number+"  and it is odd number ");

	}

}
