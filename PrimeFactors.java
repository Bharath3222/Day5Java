package com.basic.assignment;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to find it's prime factors : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("Prime Factors for number :  "+input+" are ");
		
		if (isPrime(input)) {
			System.out.print(input);
		} else {
			for (int i = 1; i <= input/2 ; i++) {
			
				if(input % i == 0 && isPrime(i)) {
					System.out.print(i+" ");
				}
			
			}
		}
		sc.close();
	}

	public static boolean isPrime(int number) {
		if(number == 1)
			return false;
		
		for (int i = 2; i <= number/2 ; i++) {
		
			if ( number % i == 0 ) {
				return false;
			}
		
		}
		return true;
	}
	}


