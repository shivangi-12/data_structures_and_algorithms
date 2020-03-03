package com.amazon.ds.bitmanipulation;

import java.util.Scanner;

public class noof1s {
public static void main(String args[]) {
	int x,i=0,c=0;
	int rem[]=new int[10];
	Scanner in=new Scanner(System.in);
	try {
	System.out.println("Enter the value of the number:");
	x=in.nextInt();
	while(x!=0) {
		rem[i]=x%2;
		if(rem[i]==1)
			c++;
		i++;
	}
	System.out.println("No of 1's are: "+c);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
