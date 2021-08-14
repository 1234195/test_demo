package javaStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class Trad {
	
	String name;
	String city;
	public Trad(String name, String city)
	{
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	
}
public class Stream3 
{

	public static void main(String[] args) {
		Trad t1=new Trad("Anjali","Salashi");
		Trad t2=new Trad("Shweta","Bambavade");
		Trad t3=new Trad("Anju","Kolhapur");
		Trad t4=new Trad("Rohini","Sangli");
		Trad t5=new Trad("Anja","Satara");
	
		
		List<Trad> T=new ArrayList<>();
		T.add(t1);
		T.add(t2);
		T.add(t3);
		T.add(t4);
		T.add(t5);
		
		
		//Quetion 9
		System.out.println("Unique city");
		//List<Trad> UniqueCity=T.stream().filter(DistictCustomProperty.distinctByKey(P -> P.getCity())).collect(Collectors.toList());
		//UniqueCity.forEach(System.out::println);
		
		//Question 10
		System.out.println("trader in pune");
		List<Trad> FromPune=T.stream().filter(P -> P.city=="Pune").sorted(Comparator.comparing(Trad::getName)).collect(Collectors.toList());	
		FromPune.forEach(System.out::println);
		
		//Question 11
		System.out.println("sorted trader name");
		//T.stream().sorted(Comparator.comparing(T::getName)).forEach(P ->System.out.println(P.name));
		
		//Question 12
		System.out.println("trader from Sangli");
		List<Trad> FromIndore=T.stream().filter(P -> P.city=="Indore").collect(Collectors.toList());	
		FromIndore.forEach(System.out::println);

	}
	
	

}
