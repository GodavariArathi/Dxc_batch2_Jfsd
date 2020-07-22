package com.finalkeyword;

class Shape {
	
	final public void draw() {
		System.out.println("Draw Method of Shape Class..");
	}
}

class Rectangle extends Shape {
	
     public void draw() {
		System.out.println("Draw Method of Rectangle Class..");
	}
}

public class FinalMethodExample {

	public static void main(String[] args) {

		Rectangle obj = new Rectangle();
		obj.draw();
		
	}

}