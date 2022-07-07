package com.basic.assignment;

import java.util.Scanner;

public class Quoitent_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter number to find quotient and remainder");
int number = scanner.nextInt();
System.out.println("Enter the number which you want to divide with :");
int divide= scanner.nextInt();
System.out.println("You entered number is :"+number+"  and it's Quotient is : "+number/divide);
System.out.println("You entered number is :"+number+"  and it's Remainder is : "+number%divide);
 
	}

}
