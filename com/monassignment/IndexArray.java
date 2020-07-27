package com.monassignment;

import java.io.*; 
import java.util.*; 
  
public class IndexArray { 
    public static void main(String[] args) 
    { 
        List<Integer> list = new ArrayList<Integer>(5); 
        list.add(10); 
        list.add(20); 
        list.add(30); 
        list.add(2, 25);
        for (Integer num : list) { 
            System.out.print(num + " "); 
        } 
    } 
} 