package javaStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class Trans
{
	 Trad trader;
	int year;
	int value;
	public Trans(Trad trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trad getTrader() {
		return trader;
	}
	public void setTrader(Trad trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transcation [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
}
public class Stream4
{
	

	public static void main(String[] args) {
		Trad A=new Trad("Anjali","Salashi");
		Trad B=new Trad("Anja","Delhi");
		Trad C=new Trad("Shweta","Bambavde");
		Trad D=new Trad("Shiv","mumbai");
		Trad E=new Trad("praju","kolhapur");
		Trad F=new Trad("Aishu","vashi");
		Trad G=new Trad("suraj","kop");
		
		
		Trans T1=new Trans(A,2010,7000);
		Trans T2=new Trans(B,2015,2000);
		Trans T3=new Trans(C,2012,70000);
		Trans T4=new Trans(D,2008,15000);
		Trans T5=new Trans(E,2017,5000);
		Trans T6=new Trans(F,2015,35000);
		Trans T7=new Trans(G,2018,95000);
		
		List<Trans> trans=new ArrayList<>();
		trans.add(T1);
		trans.add(T2);
		trans.add(T3);
		trans.add(T4);
		trans.add(T5);
		trans.add(T6);
		trans.add(T7);
		

		//Question 13
		System.out.println("transaction of trader from Delhi");
		List<Trans> FromDelhi=trans.stream().filter(P -> P.trader.getCity().equals("Delhi")).collect(Collectors.toList());	
		FromDelhi.forEach(System.out::println);
		
		
		//Question:14
		System.out.println("Highest transaction");
		Trans Max=trans.stream().max(Comparator.comparing(Trans::getValue)).get();
		System.out.println(Max);
				
		//Question 15
		System.out.println("lowest transaction");
		Trans Min=trans.stream().min(Comparator.comparing(Trans::getValue)).get();
		System.out.println(Min);
		
		
		//Question 8
		System.out.println("transaction in 2015");
		List<Trans> Year2015=trans.stream().filter(Y -> Y.year==2015).sorted(Comparator.comparing(Trans::getValue)).collect(Collectors.toList());
		Year2015.forEach(System.out::println);
		
		
		
	}

}
	
	
	

