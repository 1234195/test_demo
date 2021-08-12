
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	int AuthorID();
	String Author();
	String Supervisor();
	String date();
	String time();
	String Description();
}

@info(AuthorID=1,Author="Anjali",Supervisor="Sonali",date="11/08/20221",time="7 PM", Description="abcd")
class TestA{
	String Author;
	String  date;
	String time;
	
	public TestA(String author, String date, String time) 
	{
		super();
		Author = author;
		this.date = date;
		this.time = time;
	}
	@Override
	public String toString() 
	{
		return "TestA [Author=" + Author + ", date=" + date + ", time=" + time + "]";
	}
	
}
public class Annotation2 {

	public static void main(String[] args) {
		TestA A=new TestA("Anjali","11/08/2021","8");
		Class c=A.getClass();
		Annotation a=c.getAnnotation(info.class);
		info i=(info)a;
		System.out.println(i.Author()+"\t"+i.AuthorID()+"\t"+i.date()+"\t"+i.time()+"\t"+i.Description());

	}

}
