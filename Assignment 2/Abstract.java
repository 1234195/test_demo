package javaFirstProject;

abstract class Test{
	
	
	abstract void add();
}

class Sum extends Test{

	@Override
	void add() 
	{
		System.out.println(" add method of Test class which is overriden in sum class");	
	}
	
}
public class Abstract
{

	public static void main(String[] args)
	{
		Test a=new Sum();
		a.add();
	}

}
