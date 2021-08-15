public class ExceptionQ4 
{

		public static void main(String[] args) {
		
			LocalDate D1 = LocalDate.of(1998, 10, 10);
			LocalDate D2 = LocalDate.of(1999, 11, 5);
			LocalDate D3 = LocalDate.of(1996, 8, 9);
			LocalDate D4 = LocalDate.of(2001, 10, 9);
			
			List<Object> A=new LinkedList<>();
			A.add(D1);
			A.add(D2);
			A.add(D3);
			A.add(D4);
			
			for(Object i: A)
			{
			
				int p,q;
				
				int a=((LocalDate) i).getYear();
				if(a!=0)
				{
				p=(a%400==0)?(q=1):(a%100==0)?(q=0):((a%4==0)?(q=1):(q=0));
				if(p==1)
					System.out.println(" DOB is " +((LocalDate) i)+" & it was a leap year");
				else
					System.out.println("DOB is" +((LocalDate) i)+" & it was not a leap year");
			}
		}
			
			
		}
	
	
	
	
}
