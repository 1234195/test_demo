package javaFirstProject;

 class AccountB {

public int amount;
	
	public int ammount(int cash) {
		return amount;
	}
}

class cuurentAccount extends AccountB {
	public int CashCredit;
	public int ammount(int c) {
		CashCredit=c;
		return CashCredit;
	}
}

class savingAccount extends AccountB
{
	 int FixDeposite;
	
	public int ammount(int c)
	{
		this.FixDeposite=c;
		return FixDeposite;
	}
}

public class Account {

	public static void main(String[] args) 
	{
		int Totalamount;
		
		AccountB A=new savingAccount();
		AccountB B=new cuurentAccount();
		
		Totalamount=A.ammount(50000)+B.ammount(15000);
		
		System.out.println("total amount is :"+Totalamount);
	}

	
	
}
