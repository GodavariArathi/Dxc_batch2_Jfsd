package com.polymorphism;
abstract class Person {
	protected String name;
	protected String gender;

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public abstract void work();

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	public void changeName(String name) {
		this.name = name;
	}
}

class Employee extends Person {
	private int empId;

	public Employee(int empId, String name, String gender) {
		super(name, gender);
		this.empId = empId;
	}

	@Override
	public void work() {
		if (this.empId == 0)
			System.out.println("Not Working..");
		else
			System.out.println("Working as an Employee..");
	}

	@Override
	public String toString() {
		return "Employee [gender = " + gender + " name = " + name + " empId = " + empId + "]";
	}
}

public class AbstractMainExample {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Kartik", "Male");
		emp.work();
		System.out.println(emp);
		emp.changeName("Gautam");

		Person student = new Employee(0, "John", "Male");
		student.work();
		System.out.println(student);

	}

}
