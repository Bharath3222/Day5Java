package com.basic.assignment;

import java.util.Scanner;

public class CoinsPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
int flip=0;
int head=0;
int tail=0;
int temp=1;
System.out.println("Enter number");
float num=scanner.nextFloat();
while(flip<num)
{
	double result =Math.floor(Math.random()*10)%2;
	flip+=1;
	if(result==temp)
		head+=1;
	else
		tail+=1;
}
float headPercentage=(head*100/num);
float tailPercentage=(tail*100/num);
System.out.println(headPercentage+"% is the head percentage");
System.out.println(tailPercentage+"% is the head percentage");

	}

}
