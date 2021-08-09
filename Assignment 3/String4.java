package javaFirstProject;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("stringBuffer "); 
		
		
		sb.append("s peer class of string");
		sb.append("the functionality of string");
		
		System.out.println(sb); 
				
		//problem:2
		
		 StringBuffer s = 
	        new StringBuffer("it is used to at the specified index position");
	        System.out.println("string = " + s);
	  
	        // insert boolean value at offset 8
	        s.insert(14,"insert text");
	  
	       
	        System.out.print("After insertion = ");
	        System.out.println(s.toString());
	    
	
	             //Problem:3
	        
	        StringBuffer sr = new StringBuffer("This method returns the reversed object on which it was called");
	        System.out.println("String buffer = " + sr);
	          
	       
	        sr.reverse();
	        System.out.println("String buffer after reversing = " + sr);
	
		
	}
}

