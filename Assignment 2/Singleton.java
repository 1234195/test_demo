package javaFirstProject;

public class Singleton {

private static Singleton singletonObject;  
	
	public String msg;
	
	private Singleton()   
	{
		msg="Singleton: ";
	}
	
	public static Singleton getInstance()   
	{
		if(singletonObject==null)
		{
			singletonObject = new Singleton();
		}
		return singletonObject;
	}

	public static void main(String args[])
	{
		Singleton obj1=Singleton.getInstance();
		Singleton obj2=Singleton.getInstance();
		Singleton obj3=Singleton.getInstance();
		Singleton obj4=Singleton.getInstance();
		
		System.out.println(obj1.msg +"Obj 1");
		System.out.println(obj2.msg +"Obj 2");
		System.out.println(obj3.msg +"Obj 3");
		System.out.println(obj4.msg +"Obj 4");
		
		System.out.println("");
		
		obj3.msg = (obj3.msg).toUpperCase(); 
		
		
		System.out.println(obj1.msg +"Obj 1");
		System.out.println(obj2.msg +"Obj 2");
		System.out.println(obj3.msg +"Obj 3");
		System.out.println(obj4.msg +"Obj 4");
			
	}

}
	
	

