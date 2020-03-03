package com.amazon.ds.arrays;

import java.util.Scanner;

//Problem-statement:Given an unsorted array , find the pair with given sum in the array
//Approaches:
// 1. Brute Force: consider every pair in the given array and find if the sum is found: TC: O(n^2)
// 2. Sorting in descending order : TC: O(n log(n))
// 3. Hashing Technique: TC: O(n)-->Must be covered under hashmap package
class pairwithgivensum_BF
{
	// Naive method to find a pair in an array with given sum
	public static void findPair(int[] A, int sum)
	{
		// consider each element except last element
		for (int i = 0; i < A.length - 1; i++)
		{
			// start from i'th element till last element
			for (int j = i + 1; j < A.length; j++)
			{
				// if desired sum is found, print it and return
				if (A[i] + A[j] == sum)
				{
					System.out.println("Pair found at index "
									+ i + " and " + j);
					return;
				}
			}
		}
        
		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}

	// main function
	@SuppressWarnings("resource")
	public static void main (String[] args)
	{   int n,sum=0;
	    int A[]=new int[100];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array:");
		n=in.nextInt();
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			A[i]=in.nextInt();
		}
		System.out.println("Enter the required sum:");
        sum=in.nextInt();
		findPair(A, sum);
	}
}