package com.turing.advancedse8.oop;

public class NullObjectPattern {
	public static void main(String[]args)
	{
		EmployeeRepository rep = new EmployeeRepository();
		//Employee emp = rep.findById(0);
		//emp.work();
		rep.findByIdV2(0)
			.map(emp->{
				System.out.println("Map code");
				emp.work();
				return emp;
			});
		System.out.println("Done");
	}
}
