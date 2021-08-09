package javaFirstProject;
import java.util.Scanner;

public class Assignment3 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner ab= new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double a=ab.nextDouble();
		System.out.println("Enter the time");
		double b=ab.nextDouble();
		System.out.println("Enter the rate");
		double c= ab.nextDouble();
	
		double simpleinterest=(a*b*c)/100;
		System.out.println("principal:"+a);
		System.out.println("time:"+b);
		System.out.println("rate:"+c);
		System.out.println("simple interest is200:"+simpleinterest);
		
	}

}
