package com.amazon.ds.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Given an array of distinct integers.
//The task is to count all the triplets such that sum of two elements equals the 
//third element.
public class Triplet_BF {
public static void triplet(int A[],int n) {
	Arrays.sort(A);
	for(int i=n-1;i>=0;i--) {
		int j = 0; 
        int k = i - 1;
        while(j<k) {
        	if(A[i]==A[j]+A[k]) {
        		System.out.println("Pair found");
        		return;
        	}
        	else if(A[i]>A[j]+A[k])
        		j+=1;
        	else
        		k-=1;
        }
	}
	System.out.println("No such pair found");
}
@SuppressWarnings("resource")
public static void main(String args[]) {
	int n;
	int A[]=new int[100];
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of n elements");
	n=in.nextInt();
	System.out.println("Enter the value of elements");
	for(int i=0;i<n;i++) {
		A[i]=in.nextInt();
	}
	triplet(A,n);
}
}

