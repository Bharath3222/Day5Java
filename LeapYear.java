package com.basic.assignment;

import java.util.Scanner;

public class LeapYear {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
System.out.println("Please Enter four digit number to find out leapyear : ");
int year = scanner.nextInt();
if(year<10000&&year>999)
{
if(year%4==0)
System.out.println("Entered year " +year+" is leap year");
else
System.out.println("Entered year " +year+" is not leap year");
}
else
System.err.println("Sorry you entered number is :"+ year+" Please Enter 4 digit number to find out leap year");


}

}
