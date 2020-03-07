package com.amazon.ds.strings;

import java.util.Scanner;

//Given an array of Strings , find the common prefix between array of Strings
//Input: {"geeksforgeeks","geezer","geek"}
//Output: "gee"
//Using the divide and conquer approach here
public class LongestCommonPrefix {
	
	static String commonPrefixUtil(String str1, String str2) {
		String result=" ";
		int n=str1.length();
		int m=str2.length();
		for(int i=0,j=0;i<=n-1&&j<=m-1;i++,j++) {
			if (str1.charAt(i) != str2.charAt(j)) { 
                break; 
            } 
            result += str1.charAt(i); 
		}
		return result; 
		
	}
    public static String commonPrefix(String arr[],int low,int high) {
		if(low==high) {
			return (arr[low]);
		}
		if(high>low) {
			int mid=low+(high-low)/2;
			String str1=commonPrefix(arr, low, mid);
			String str2=commonPrefix(arr, mid+1, high);
			return (commonPrefixUtil(str1, str2)); 
		}
    	return null;
    	
    }
	public static void main(String[] args) {
        int n;
		String arr[]=new String[20];
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of strings in the array");
        n=in.nextInt();
        System.out.println("Enter the strings");
        for(int i=0;i<n;i++) {
        	arr[i]=in.next();
        }
        String ans=commonPrefix(arr,0,n-1);
        if (ans.length() != 0) { 
            System.out.println("The longest common prefix is "+ ans); 
        } else { 
            System.out.println("There is no common prefix"); 
        } 
	}

}
