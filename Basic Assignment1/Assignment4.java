package javaFirstProject;
import java.util.Scanner;
public class Assignment4 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks1,marks2,marks3;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark sub 1");
		marks1=sc.nextInt();
		System.out.println("enter the mark sub 2");
		marks2=sc.nextInt();
		System.out.println("enter the mark sub 3");
		marks3=sc.nextInt();
		
		if(marks1>60 && marks2>60 && marks3>60) {
			System.out.println("pass");
		}
		else if((marks1>60 && marks2>60)||(marks2>60 && marks3>60)||(marks1>60 && marks3>60)) {
			System.out.println("promoted");
		}
		else if(marks1>60 || marks1<60 && marks2<60 && marks2<60) {
			System.out.println("Fail");
		}	
		
		
	}

}
