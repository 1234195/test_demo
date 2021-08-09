package javaFirstProject;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "Java String pool refers to collection of Strings which are stored in heap memory";
        n = n.toLowerCase();
        System.out.println(n);
        
        //problem 2
        n = n.toUpperCase();
        System.out.println(n);
         
        // problem 3
        String letter = "Java String pool refers to collection of Strings which are stored in heap memory";
        letter = letter.replace("a","$");
        System.out.println(letter);
        
        
        //problem 4
        String s = "Java String pool refers to collection of Strings which are stored in heap memory";
        if(s.contains("collection")) {  
            System.out.println("String contain collection");  
        }else  
            System.out.println("collection not found");
        
        //problem5
		System.out.println(s.equals("java string pool refers to collection of strings which are stored in heap memory"));
		
		//problem 6
		System.out.println(s.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
    }  

	
	  
	 
	 
	 
	 
	 
	 
	 
			
		
	}

