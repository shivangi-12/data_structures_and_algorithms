package com.amazon.ds.arrays;
import java.util.Arrays;
import java.util.Scanner;

class pairwithgivensum_Sorting
{
	// Naive method to find a pair in an array with given sum
	public static void findPair(int[] A, int sum)
	{
		// sort the array in ascending order
		Arrays.sort(A);

		// maintain two indices pointing to end-points of the array
		int low = 0;
		int high = A.length - 1;

		// reduce search space arr[low..high] at each iteration of the loop

		// loop till low is less than high
		while (low < high)
		{
			// sum found
			if (A[low] + A[high] == sum)
			{
				System.out.println("Pair found");
				return;
			}

			// increment low index if total is less than the desired sum
			// decrement high index is total is more than the sum
			if (A[low] + A[high] < sum) {
				low++;
			} else{
				high--;
			}
		}

		// No pair with given sum exists in the array
		System.out.println("Pair not found");
	}

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