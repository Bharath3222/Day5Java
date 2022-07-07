package com.basic.assignment;

import java.util.Scanner;

public class NthHarmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the number to find the harmonic number");
int number = scanner.nextInt();
float harmonic=0;

for (int i = 1; i <= number; i++) {
    harmonic += (float)1 / i;
}
System.out.println("Harmonic number is : "+ harmonic);
}}
	
