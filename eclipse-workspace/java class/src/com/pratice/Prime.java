package com.pratice;

public class Prime {
	
	int n=2;
	
	public void printPrime()
	{
		int i;
		
		for(i=1;i<n;i++) {
			
			if(n%i==0) {
				System.out.println(n + "Is Prime");
			}
			else
				System.out.println(n + "Is not Prime");
			}
		}
	
public static void main(String args[]) {
	
	Prime a = new Prime();
	a.printPrime();
	
	
}
}

