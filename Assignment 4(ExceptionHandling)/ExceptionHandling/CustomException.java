package ExceptionHandling;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		long id;
		double Accountbal;
		double withdraw;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your account ID");
		id=scan.nextLong();
		System.out.println("Enter your account Balance");
		Accountbal=scan.nextDouble();
		System.out.println("Enter withdraw amount");
		withdraw=scan.nextDouble();
		
		//Part 2:Raising IllegalBankTransactionException
		
		try {
			if(withdraw<0) 
			{
				System.out.println("Invalid Withdraw Amount");
				throw new IllegalBankTransaction("Invalid Withdraw Amount");
			}
			else {
				
				System.out.println("Withdraw successfully");
				System.out.println("Remaining balance is : "+(Accountbal-withdraw));
			}
			
		} 
		catch (IllegalBankTransaction b) 
		{
			b.printStackTrace();
		}
		

	}

}
