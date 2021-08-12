import java.util.*;


class lamda2
{
		public static void main(String[] args)
		{
			@SuppressWarnings("unused")
			Scanner sc = new Scanner(System.in);
			int n = 5;

			// Declaring the ArrayList with
			// initial size n
			ArrayList<String> arrli
				= new ArrayList<String>(n);

			arrli.add("Anjali");
	       	arrli.add("Anju");
	        arrli.add("pooja");
	     	arrli.add("priya");
	        arrli.add("preeti");
	      	
	      	
	  		arrli.removeIf(s -> (s.length()%2!=0));
			
	       
			for (int i = 0; i < arrli.size(); i++)
				System.out.print(arrli.get(i) + " ");
		}
	}


	
	
	
	

