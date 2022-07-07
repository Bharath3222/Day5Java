package com.basic.assignment;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int base=2;
int result=1;

for (int i=1; i<=31;i++)
{
	result *=base;
	System.out.println(base+" power " + i +" is "+ result);
}

	}

}
