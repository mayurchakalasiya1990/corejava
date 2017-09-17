package org.corejava.passbyvalue_ref;


/*
 
 PassByValue - The Java Spec says that everything in Java is pass-by-value. There is no such thing as "pass-by-reference" in Java.
 
*/

public class PassByValue {

	public static void main(String[] args) {

		int i=5;
		int j=7;
		
		System.out.println("Before i="+i+" j="+j);
		foo(i,j);
		System.out.println("After i="+i+" j="+j);

	}
	
	public static int foo(int i,int j){		
		i+=1;
		j+=2;
		System.out.println("Sum Method: i="+i+" j="+j);
		return (i+j);
	}
	
}
