package javaGenerics;

import java.util.*;

public class Generics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   HashMap<Integer, Double> key  = new HashMap<>();
		   
	    
	        HashMap<Integer, Double> value= new HashMap<Integer, Double>();
	
	        key.put(1,3.5);
	        key.put(2, 5.5);
	        key.put(3, 6.5);
	 
	        value.put(4, 1.2);
	        value.put(5, 3.2);
	        value.put(6, 3.8);
	 
	        System.out.println("key : "+ key);
	                        
	        System.out.println("values : "+ key);
	                      
	    }
		
		
		
	}


