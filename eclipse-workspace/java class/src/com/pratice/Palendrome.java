package com.pratice;

import java.util.Scanner;

class Palendrome
{
	public static void main(String args[])
	{
		System.out.println("enter your string");
		Scanner ipstring = new Scanner(System.in);
        String str = ipstring.next();
	    ipstring.close();
        String reverse = "";
        char a[]  = str.toCharArray();
        for(int i=a.length-1;i>=0;i--)
        {
       reverse = reverse+a[i];
        	
        }
        
		System.out.println(reverse);	
		if(str.equals(reverse))
		{
			
			System.out.println("enter string is plendrome");
			
		}
		else {
			System.out.println("not palendrome");
		}
		
			
	}
	
}