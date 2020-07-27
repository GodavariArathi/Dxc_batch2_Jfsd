package com.monassignment;
import java.util.Scanner;
class arraymax 
{    
	 static int findMaximum(int arr[], int low, int high) 
	    { 
	       int max = arr[low]; 
	       int i; 
	       for (i = low; i <= high; i++) 
	       { 
	           if (arr[i] > max) 
	              max = arr[i]; 
	       } 
	       return max; 
	    } 
	      
	    
	    public static void main (String[] args)  
	    { 
	    	int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            arr[i] = s.nextInt();
	        }
	        
	        System.out.println("The maximum element is "+findMaximum(arr, 0, n-1)); 
	        System.out.println("Time Complexity is O(n)");
	    } 
    } 