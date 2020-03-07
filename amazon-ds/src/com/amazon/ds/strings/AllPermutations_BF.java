package com.amazon.ds.strings;

import java.util.Scanner;

public class AllPermutations_BF {
static void printdistinctPerm(String str, String ans) {
	if(str.length()==0) {
		System.out.println(ans+" ");
	return;
	}
	boolean[] alpha=new boolean[26];
	int i;
	for(i=0;i<str.length();i++) {
		char ch=str.charAt(i);
	
	//Rest of the string excluding the ith character
	String ros=str.substring(0,i)+str.substring(i+1);
	if(alpha[ch-'a']==false)
		printdistinctPerm(ros, ans+ch);
	alpha[ch-'a']=true;
	}
}
public static void main(String args[]) {
	System.out.println("Enter the string you want permutation for");
	 Scanner in=new Scanner(System.in);
	 String s=in.next();
     printdistinctPerm(s, ""); 
}
}
