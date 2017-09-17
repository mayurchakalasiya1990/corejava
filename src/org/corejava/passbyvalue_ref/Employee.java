package org.corejava.passbyvalue_ref;

public class Employee {

	private String ename;
	private double salary;

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.ename = "Mayur";
		e1.salary = 18000;

		System.out.println("Before foo:" + e1);
		foo(e1);
		System.out.println("After foo:" + e1);

		boolean result=e1.ename.equals("Mayur");
		System.out.println("Result:"+result);
	}

	public static void foo(Employee e1) {

		// Change ename property/field of Employee object e1
		e1.ename = "XYZ";

		// instantiate with new Employee Object Copy
		e1 = new Employee();
		
		System.out.println("Foo:"+e1);
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + "]";
	}

}
