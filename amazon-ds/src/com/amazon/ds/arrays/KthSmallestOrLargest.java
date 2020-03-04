package com.amazon.ds.arrays;
//Kth smallest first
//arr[]={7,10,4,3}
//k=3
//Output=7
	// Java code for kth smallest element 
	// in an array 
	import java.util.Arrays; 
    import java.util.Scanner; 

	public class KthSmallestOrLargest 
	{ 
		// Function to return k'th smallest 
		// element in a given array 
		public static int kthSmallest(int[] arr, 
											int k) 
		{ 
			// Sort the given array 
			Arrays.sort(arr); 

			// Return k'th element in 
			// the sorted array 
			return arr[k-1]; 
		} 
		
		// driver program 
		public static void main(String[] args) {
	    int n;
		int k;
		int arr[]=new int[20];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array:");
		n=in.nextInt();
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		} 
		System.out.println("Enter the value of k");
		k=in.nextInt();
			System.out.print( "K'th smallest element is "+ 
								kthSmallest(arr, k) );	 
		} 
	} 
