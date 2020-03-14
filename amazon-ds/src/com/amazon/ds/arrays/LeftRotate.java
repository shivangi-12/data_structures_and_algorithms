package com.amazon.ds.arrays;

import java.util.*;


public class LeftRotate {
     static void leftRotate(int arr[],int n,int k){
       int mod=k%n;
       for(int i=0;i<n;i++){
           System.out.print(arr[(i+mod)%n]+" ");
       }
     }

  
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int n;
		int k;
		int arr[]=new int[20];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array:");
		n=in.nextInt();
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		} 
		System.out.println("Enter the value of k");
		k=in.nextInt();
			leftRotate(arr,n,k);	 

    }
}
