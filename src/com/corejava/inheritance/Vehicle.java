package com.corejava.inheritance;


/*

- The java compiler adds public and abstract keywords before the interface method. More, 
- It adds public, static and final keywords before data members.


- Class extends AnotherClass
- Class implements Interface
- Interface extends Interface

Multiple inheritance by interface

- Class implements Interface1,Interface2
- Interface extends Interface1,Interface2



*/



public interface Vehicle {

	
	public int noOfFuelTank=1;
	
	public void start();
	
	public void stop();
	
	public void fillUpFuel(); 
	
	
}
