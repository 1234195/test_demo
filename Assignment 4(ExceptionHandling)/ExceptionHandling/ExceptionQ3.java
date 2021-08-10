package ExceptionHandling;
import java.util.Scanner;

public class ExceptionQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		long id;
		double Accountbal;
		double withdraw;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your account id");
		id=s.nextLong();
		System.out.println("Enter your account Balance");
		Accountbal=s.nextDouble();
		System.out.println("Enter withdraw amount");
		withdraw=s.nextDouble();
		
		//part 1
		
		try {
			if(withdraw>Accountbal || Accountbal==0)
			{
				System.out.println("Insufficient Balance!!!");
				throw new InsufficientBalance("Insufficient Balance");
			}
			else {
				System.out.println("Successfully Wihdrow!");
				System.out.println("Remaining balance is : "+(Accountbal
						-withdraw));
			}
		} catch (InsufficientBalance a) {
			a.printStackTrace();
		}
		
		
	}
		
		
		
	}


