package com.monassignment;
	import java.util.LinkedList; 

	import java.util.Queue; 

	import java.util.Stack; 
	public class QueueReverse { 

	  

	    static Queue<Integer> queue; 

	  

	    // Function to reverse the first 

	    // K elements of the Queue 

	    static void QueueReverse(int k) 

	    { 

	        if (queue.isEmpty() == true

	            || k > queue.size()) 

	            return; 

	        if (k <= 0) 

	            return; 

	  

	        Stack<Integer> stack = new Stack<Integer>(); 

	  

	        // Push the first K elements into a Stack 

	        for (int i = 0; i < k; i++) { 

	            stack.push(queue.peek()); 

	            queue.remove(); 

	        } 

	  

	        // Enqueue the contents of stack 

	        // at the back of the queue 

	        while (!stack.empty()) { 

	            queue.add(stack.peek()); 

	            stack.pop(); 

	        } 

	  

	        // Remove the remaining elements and enqueue 

	        // them at the end of the Queue 

	        for (int i = 0; i < queue.size() - k; i++) { 

	            queue.add(queue.peek()); 

	            queue.remove(); 

	        } 

	    } 

	  

	    //  print the Queue 

	    static void Print() 

	    { 

	        while (!queue.isEmpty()) { 

	            System.out.print(queue.peek() + " "); 

	            queue.remove(); 

	        } 

	    } 

	    public static void main(String args[]) 

	    { 

	        queue = new LinkedList<Integer>(); 

	        queue.add(20); 

	        queue.add(120); 

	        queue.add(45); 

	        queue.add(66); 

	        queue.add(75); 

	        queue.add(90); 

	        queue.add(70); 
	        
	        int k = 5; 

	        QueueReverse(k); 

	        Print(); 

	    } 
	}

