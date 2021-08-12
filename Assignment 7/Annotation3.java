
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  

@interface Execute
{
	int Seq();
}

class Annotation
{
	@Execute(Seq=2)
	public void method1()
	{
		System.out.println("Method : 1");
	}
	
	@Execute(Seq=1)
	public void method2()
	{
		System.out.println("Method : 2");
	}
	
	@Execute(Seq=3)
	public void method3()
	{
		System.out.println("Method : 3");
	}
}

public class Annotation3 {
	
	public static void main(String[] args)
	{
		Annotation3 a= new Annotation3();
		Method[] m= a.getClass().getMethods();
		
		for (Method method: m)
		{
			Execute ex= method.getAnnotation(Execute.class);
			
			if (ex!=null)
			{
				try
				{
					method.invoke(a);
					System.out.println(ex);
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}