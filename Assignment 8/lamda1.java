public class lamda1 {

	interface FuncInter
	{
		int operation(int a, int b);
	}

	
	private int operate(int a, int b, FuncInter fobj)
	{
		return fobj.operation(a, b);
	}

	public static void main(String args[])
	{
		
		FuncInter add = (int x, int y) -> x + y;
		
      	FuncInter sub = (int x, int y) -> x - y;
		
      	FuncInter div = (int x, int y) -> x / y;
      
		FuncInter multiply = (int x, int y) -> x * y;


		lamda1 tobj = new lamda1();

		
		System.out.println("Addition is " +
						tobj.operate(6, 3, add));
      
       System.out.println("subtraction is " +
						tobj.operate(6, 3, sub));

		
		System.out.println("Multiplication is " +
						tobj.operate(6, 3, multiply));
       
       System.out.println("Div is " +
						tobj.operate(6, 3, div));
      	
	}
	
}















