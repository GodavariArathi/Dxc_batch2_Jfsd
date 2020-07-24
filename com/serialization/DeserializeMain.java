package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMain {

	public static void main(String[] args) {

		try (FileInputStream fileIn = new FileInputStream("E:\\dxc-data\\employee.ser");
				ObjectInputStream in = new ObjectInputStream(fileIn);) {
			Employee emp = (Employee) in.readObject();
			System.out.println(emp);
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}