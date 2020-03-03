package com.amazon.ds.arrays;

import java.util.Scanner;

class maxlengthsubarray_BF
{
	// Naive function to find maximum length sub-array with sum S present
	// in the given array
	public static void maxLengthSubArray(int[] A, int S)
	{
		// len stores the maximum length of sub-array with sum S
		int len = 0;

		// stores ending index of maximum length sub-array having sum S
		int ending_index = -1;

		// consider all sub-arrays starting from i
		for (int i = 0; i < A.length; i++)
		{
			int sum = 0;

			// consider all sub-arrays ending at j
			for (int j = i; j < A.length; j++)
			{
				// sum of elements in current sub-array
				sum += A[j];

				// if we have found a sub-array with sum S
				if (sum == S)
				{
					// update length & ending index of max length subarray
					if (len < j - i + 1)
					{
						len =  j - i + 1;
						ending_index = j;
					}
				}
			}
		}

		// print the sub-array
		System.out.println("[" + (ending_index - len + 1) 
							+ ", " + ending_index + "]");
	}

	// main function
	@SuppressWarnings("resource")
	public static void main (String[] args)
	{
		int n,sum=0;
	    int A[]=new int[100];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements in the array:");
		n=in.nextInt();
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<A.length;i++) {
			A[i]=in.nextInt();
		}
		System.out.println("Enter the required sum:");
        sum=in.nextInt();

		maxLengthSubArray(A, sum);
	}
}

