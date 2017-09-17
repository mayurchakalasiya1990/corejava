package org.corejava.concept;

/*
 
 1) equals() method 
 2) toString() method
 3) POJO class - Example of Encapsulation
 4) difference between == and equals method 
 
 
 * */

public class Equales {

	
	
	
	public static void main(String[] args) {
		
		Square s1=new Square();
		Square s2=null;
		s2=s1;
		//Square s2=new Square();
		
		// == compare byte value of Object
		if(s1==s2){
			System.out.println("S1==S2");
		}else{
			System.out.println("S1!=S2");
		}
		
		
		// equals compare actual value of Object(if implementation of equals is not provided in class then  it will use equals method of Object Class)
		if(s1.equals(s2)){
			System.out.println("s1.equals(s2)==true");
		}else{
			System.out.println("s1.equals(s2)==false");
		}
		
		Square s3=new Square();
		Square s4=new Square();
		
		
	}
	
}
