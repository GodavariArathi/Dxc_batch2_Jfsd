package com.finalkeyword;

class Program {

	final int count = 100;
	public void setCount() {
	System.out.println(this.count);
	  count = 200;	
	 
	}
	
}

public class FinalVariableExample {

	public static void main(String[] args) {
		
		Program obj = new Program();
		obj.setCount();
		
	}

}
