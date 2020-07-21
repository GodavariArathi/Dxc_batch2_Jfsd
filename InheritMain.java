import java.util.Scanner;

class Employee {
int employeeId;
	String employeeName;

	public Employee() {
	System.out.println("Default Constructor of Employee Class Invoked..");
}

	private static Scanner scan = new Scanner(System.in);

	public void acceptDetails() {
		System.out.print("Enter Employee Id : ");
	this.employeeId = scan.nextInt();
	scan.nextLine();
	System.out.print("Enter Employee Name : ");
	this.employeeName = scan.nextLine();
	}

	public void displayDetails() {
		System.out.println("Employee Details : ");
		System.out.println("Employee Id : " + this.employeeId);
		System.out.println("Enter Employee Name : " + this.employeeName);
	}
}

public class Wage extends Employee {
	int baseSalary;
	int hourlyRate;
	private static Scanner scan = new Scanner(System.in);

public Wage() {
	System.out.println("Default Constructor of EmployeeWage Invoked..");
	}

public void acceptDetails() {
		super.acceptDetails();
	System.out.print("Enter Employee Base Salary : ");
		this.baseSalary = scan.nextInt();
		System.out.print("Enter Employee Hourly Rate : ");
		this.hourlyRate = scan.nextInt();
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Employee Details : ");
		System.out.println("Base Salary : " + this.baseSalary);
		System.out.println("Hourly Rate : " + this.hourlyRate);
	}

}


public class InheritMain {
	public static void main(String[] args) {

		Wage emp = new Wage();
			emp.acceptDetails();
			emp.displayDetails();
		}

}
