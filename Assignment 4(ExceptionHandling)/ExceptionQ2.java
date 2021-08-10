package javaException;

public class ExceptionQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            int m=40; int n=0; int p=0;
		
		try
		{
			p = m/n;
		}
		
		catch(ArithmeticException ec)
		{
			ec.printStackTrace();
			throw new UnsupportedOperationException();
		}
		
		System.out.println(p);
	}
		
		
		

	}


