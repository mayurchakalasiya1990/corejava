package com.corejava.inheritance;

 abstract class AbsCalculator {
	
	// concreat method ,abstract method
	
	//instance variable
	int i,j;
	
	/*public AbstractCal(int i,int j){
		//i,j local variable
		this.i=i;
		this.j=j;
	}*/
	/*public AbstractCal(){
		//i,j local variable
		this.i=i;
		this.j=j;
	}*/
	
	
	public abstract int sum(int i,int j);
	
	
	public int mult(int i, int j){
		return (i*j);
	}
}

 public class Calculator extends AbsCalculator{

	/*public Calculator(){
		
	}
	
	public Calculator(int i, int j) {
		
		super(i, j);
		// TODO Auto-generated constructor stub
	}*/

	@Override
	public int sum(int i, int j) {
		// TODO Auto-generated method stub
		return (i+j);
	}
	
	public static void main(String[] args){
		
		Calculator obj1=new Calculator();
		
		Calculator obj2=new Calculator();
		
		System.out.println(obj2);
		
		int z=obj1.mult(5,6);
		
		int x=obj1.sum(5,6);
		
		System.out.println("mult:"+z);
		
		System.out.println("sum:"+x);
		
	}
	
}


