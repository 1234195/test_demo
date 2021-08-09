package javaFirstProject;
import java.util.Scanner;
public class Assignment6 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username="Anjali";
		String password="Anjali123";
		int attempts=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter your Usename:");
			String a=sc.next();
			System.out.println("Enter your Password:");
			String b=sc.next();
			if("Anjali".equals(a) && "Anjali123".equals(b)) {
				System.out.println("Welcome");
				break;
			}
			else {
				attempts++;
				System.out.println("enter correct username and password");
				System.out.println("Number of attempts left:"+(3-attempts));
			}
			if(attempts==3) {
				System.out.println("Contact Admin");
				break;
			}
		}
		
		
		
		
	}

}
