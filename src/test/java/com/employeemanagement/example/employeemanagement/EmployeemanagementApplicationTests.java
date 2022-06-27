package com.employeemanagement.example.employeemanagement;

import com.employeemanagement.example.employeemanagement.models.Employee;
import com.employeemanagement.example.employeemanagement.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeemanagementApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee1 = new Employee("Mr. Whatever",72,123456,"whatever@what.ever");
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Mrs. Whatever",82,123455,"whateve@what.ever");
		employeeRepository.save(employee2);
	}

}
