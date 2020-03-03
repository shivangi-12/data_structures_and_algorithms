package com.amzon.ds.strings;
import java.util.*;
import java.lang.*;
import java.io.*;

class Anagram_Sort {
    public static String sortstring(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t;
	    t=in.nextInt();
	    while(t-->0){
	        String str1=in.next();
	        String str2=in.next();
	        System.out.println("String 1 is:"+sortstring(str1));
	        System.out.println("String 2 is:"+sortstring(str2));
	        if(sortstring(str1).equals(sortstring(str2)))
	        System.out.println("YES");
	        else
	        System.out.println("NO");
	        
	    }
	    
		//code
	}
}

