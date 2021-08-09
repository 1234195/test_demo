package javaFirstProject;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String []args) {
	    int a,b ,no, temp;
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter how many no for sort:");
	    no = sc.nextInt();
	 
	    int array[] = new int[no];
	 
	    System.out.println("Enter " + no + " numbers: ");
	 
	    for (a = 0; a < no; a++) 
	    	array[a] = sc.nextInt();
	 
	    for (a = 0; a < ( no - 1 ); b++) {
	      for (b = 0; b < no - a - 1; b++) {
	        if (array[b] > array[b+1]) 
	        {
	           temp = array[b];
	           array[b] = array[b+1];
	           array[b+1] = temp;
	        }
	      }
	    }
	 
	    System.out.println("sorted no is:");
	 
	    for (a = 0; a < no; a++) 
	      System.out.println(array[a]);
	
	
	}

}
