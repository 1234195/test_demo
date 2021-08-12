import java.io.*;
import java.util.*;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
   public String apply(String str) {
      return str.toLowerCase();
   }
}
public class lamda6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = 5;

		// Declaring the ArrayList with
		// initial size n
		ArrayList<String> arrli
			= new ArrayList<String>(n);

		arrli.add("ANJALI");
       	arrli.add("ANJU");
        arrli.add("POOJA");
     	arrli.add("PRIYA");
        arrli.add("PREETI");
      	
      	System.out.println(arrli);
  		arrli.replaceAll(new Op());
		
       
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
	
}
