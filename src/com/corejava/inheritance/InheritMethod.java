package com.corejava.inheritance;


/*
 
 1) Method Overloading and Overriding 
 
 
 * */
 
class SuperClass{
	
	
	public int sum(int i,int j){
		return (i+j);
	}
	
	//datatype of i/p params are changed
	public double sum(double i,int j){
		return (i+j);
	}
	
	//order of i/p params are changed
	public int sum(int j,double i){
		return (int)(i+j);
	}
	
	/*public int sum(int i,int j){
		return (i+j);
	}*/
	
}


public class InheritMethod extends SuperClass{


	
}
