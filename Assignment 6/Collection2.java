import java.util.*;
public class Collection2 {

	 public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
	        HashSet<String> h = new HashSet<String>();
	        int i=1;
	        while(i!=10)
	        {
	          System.out.print("Enter object ");  
			      String a= sc.nextLine();  
	      	  if(h.contains(a))
	          {
	            continue; 
	          }
	      	  else{
	            h.add(a);
	        	  System.out.println("added in List"
							+ h);
	          }
	        }
	    }	
	
	
	
}
