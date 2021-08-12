import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;





@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String str();
}
class Abc{
	@Test(str="Capgemini")
	
	public void company() 
	{
		System.out.println("Capgemini,Airoli");
	}
}
public class Annotation1 {

	public static void main(String[] args)
	{
		Abc obj=new Abc();
		obj.company();
		Class c=obj.getClass();
		
		Annotation a=c.getAnnotation(Test.class);
		Test t=(Test)a;
		System.out.println(t.str());
		}

