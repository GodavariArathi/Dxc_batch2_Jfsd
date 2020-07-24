package com.streamsapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPIDemo {
	
	public static void main(String[] args) {
		
		
		 Stream Filter;
		 
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(101, "King", "Male", 23));
		employeeList.add(new Employee(102, "Kochhar", "Male", 40));
		employeeList.add(new Employee(103, "Shreya", "Female", 33));
		employeeList.add(new Employee(104, "Gautam", "Male", 35));
		employeeList.add(new Employee(105, "Sarah", "Female", 43));
		
		// employeeList.forEach(emp -> System.out.println(emp));
		
		
		employeeList.stream()
		.filter(emp -> emp.gender.equals("Male")) // Filter Gender
		.map(em -> em.name)	// Fetch Gender
		.forEach(System.out::println); // Print
		 
		
		
		List<Employee> employees = employeeList.stream()
					.filter(emp -> emp.gender.equals("Male")) // Filter Gender
					.map(em -> em)	// Fetch Gender
					.collect(Collectors.toList());
		System.out.println(employees);
		
		
		employeeList.stream()
		.filter(emp -> emp.gender.equals("Male")) // Filter Gender
		.forEach(System.out::println); // Print
		
		
		
		
		
	}

}
