package com.notation;
class Program{
	public void show(int[] numbers) {
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
	}
}
public class NotationsDemo {
   public static void main(String[] args) {
	  Program obj=new Program();
	  int [] numbers= {1,2,3,4,5};
	  obj.show(numbers);
	   System.out.println();
}
}
