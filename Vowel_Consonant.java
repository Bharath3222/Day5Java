package com.basic.assignment;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter charachter to find it is vowel or consonant");
		String alphabet = scanner.next();
		char charchter = alphabet.charAt(0);
		if(charchter=='a'||charchter=='e'||charchter=='i'||charchter=='o'||charchter=='u'||charchter=='A'||charchter=='E'||charchter=='I'||charchter=='O'||charchter=='U')
		System.out.println("Entered character "+alphabet+" is  Vowel"); 
		
		else if((charchter>='a'&&charchter<='z')||(charchter>='A'&&charchter<='Z'))
			System.out.println("Entered character "+alphabet+" is Consonant");
		
		      else
			System.err.println("Not an charachter , please try again ");	

}}
