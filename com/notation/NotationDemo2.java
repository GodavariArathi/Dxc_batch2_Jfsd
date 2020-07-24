package com.notation;
class Pro1{
	public void show(int[] numbers) {
		
		for(int number:numbers)
			System.out.println(number);
	}
}
public void show3(int [] numbers,String[] name) {
	for(int number : numbers) {
		System.out.println(number);
	}
	for(String name : names) {
		System.out.println(name);
	}
}
public class NotationDemo2 {
   public static void main(String[] args) {
	  Pro1 obj=new Pro1();
	  int [] numbers= {1,2,3,4,5};
	  obj.show(numbers);
	   System.out.println();
}
}
