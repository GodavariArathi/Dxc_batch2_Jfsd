import java.util.Scanner;

class Employee {

	int employeeId;
	String employeeName;

	public Employee(int id, String name) {
		this.employeeId = id;
		this.employeeName = name;
	}

	public void displayDetails() {
		System.out.println("Employee Details : ");
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Enter Employee Name : " + this.employeeName);
	}
}

class EmployeeWage extends Employee {
	int baseSalary;
	int hourlyRate;
	public EmployeeWage(int id, String name, int bs, int hr) {
		super(id, name);
		this.baseSalary = bs;
		this.hourlyRate = hr;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee Details : ");
	System.out.println("Base Salary : " + this.baseSalary);
	System.out.println("Hourly Rate : " + this.hourlyRate);
}
}

public class InheritMain1 {
	public static void main(String[] args) {

		EmployeeWage emp = new EmployeeWage(101, "King" , 12000, 120);
			emp.displayDetails();
		}
}
