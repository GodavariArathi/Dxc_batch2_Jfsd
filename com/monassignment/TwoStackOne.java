package com.monassignment;
	import java.util.Arrays;
	import java.util.List;

	class Stack
	{
		private int[] arr;
		private int capacity;
		private int top1, top2;

		// Constructor
		public Stack(int n)
		{
			capacity = n;
			arr = new int[n];
			top1 = -1;
			top2 = n;
		}

		// Function to insert a given element into the first stack
		public void push1(int key)
		{
			// check if the array is full
			if (top1 + 1 == top2)
			{
				System.out.println("Stack Overflow");
				System.exit(-1);
			}

			top1++;
			arr[top1] = key;
		}

		public void push2(int key)
		{
			
			if (top1 + 1 == top2)
			{
				System.out.println("Stack Overflow");
				System.exit(-1);
			}

			top2--;
			arr[top2] = key;
		}

		
		public int pop1()
		{
			
			if (top1 < 0)
			{
				System.out.println("Stack UnderFlow");
				System.exit(-1);
			}

			int top = arr[top1];
			top1--;
			return top;
		}

		// Function to pop an element from the second stack
		public int pop2()
		{
			// if no elements are left in the array
			if (top2 >= capacity)
			{
				System.out.println("Stack UnderFlow");
				System.exit(-1);
			}

			int top = arr[top2];
			top2++;
			return top;
		}
	}

	class TwoStackOne
	{
		public static void main(String[] args)
		{
			List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
			List<Integer> list2 = Arrays.asList( 6, 7, 8, 9, 10);

			Stack stack = new Stack(list1.size() + list2.size());

			for (int i: list1) {
				stack.push1(i);
			}

			for (int j: list2) {
				stack.push2(j);
			}

			System.out.println("Popping element from the first stack : " + stack.pop1());
			System.out.println("Popping element from the second stack : " + stack.pop2());
		}
	}

