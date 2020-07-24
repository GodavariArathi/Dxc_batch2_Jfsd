package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMain {

	public static void main(String[] args) {

		Address addr = new Address();
		addr.setHouseNumber(198);
		addr.setStreetName("Civil Lines");
		addr.setCurrentCity("Delhi");
		
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("King Kochhar");
		emp.setDepartment("Sales");
		emp.setAddress(addr);
		

		FileOutputStream fileOut = null;
		ObjectOutputStream outStream = null;
		try {
			fileOut = new FileOutputStream("E:\\dxc-data\\employee.ser");
			outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			System.out.println("Employee Object is serialized Successfully.");
			outStream.close();
			fileOut.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}