package com.turing.advancedse8.oop;

import java.util.Optional;

public class EmployeeRepository {
	Employee findById(int id)
	{
		if(id!=0)
		{
			return new Employee(id);
		}
		else
		{
			return new EmptyEmployee();
		}
	}
	Optional<Employee> findByIdV2(int id)
	{
		if(id!=0)
		{
			return Optional.of(new Employee(id));
		}
		else
		{
			return Optional.empty();
		}
	}
}
