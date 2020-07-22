package com.polymorphism;
class Calcula {

	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	public int addition(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public float addition(float num1, float num2, float num3) {
		return num1 + num2 + num3;
	}

	public float addition(int num1, float num2) {
		return num1 + num2;
	}

	public float addition(float num1, int num2) {
		return num1 + num2;
	}

}

public class OverloadingExample {

	public static void main(String[] args) {

		Calcula obj = new Calcula();
		System.out.println("Result : " + obj.addition(100, 200));
		System.out.println("Result : " + obj.addition(100, 200, 300));
		System.out.println("Result : " + obj.addition(12.0F, 15.0F, 20.4F));
		System.out.println("Result : " + obj.addition(100, 234.45F));
		System.out.println("Result : " + obj.addition(123.45F, 450));

	}

}
