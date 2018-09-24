package com.example.MessageProducer;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/emp")
public class EmployeeService {

	@GetMapping(value="/select/{id}", produces=MediaType.APPLICATION_XML_VALUE)
	//@RequestMapping(path="/select",method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
	public Employee readEmploye(@PathVariable("id")int id)
	{
		Employee emp = new Employee();
		emp.setName("Pranit");
		emp.setAge(22);
		emp.setSalary(12345);
		System.out.println(id);
		return emp;
	}
	
	@PostMapping(value="/insert", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee insertEmp(@RequestBody Employee emp)
	{
		System.out.println(emp);
		
		return emp;
	}
}
