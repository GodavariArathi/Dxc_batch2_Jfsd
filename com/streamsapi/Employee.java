package com.streamsapi;

public class Employee {

	 int id;
	 String name;
	 String gender;
	 int age;
	

	public Employee(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}