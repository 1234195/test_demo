package javaFirstProject;

public class Assignment1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int n=155;
	int remainder,result=0,anotherNo;
	anotherNo=n;
	while(n>0)
	{
		remainder=n%10;
		result+=remainder*remainder*remainder;
		n=n/10;
		
	}
	if(result==anotherNo)
	{
		
		System.out.println("given no is amstrong");
	}
	else
	{
		
		System.out.println("given no is amstrong");
	}
		

	}
}
