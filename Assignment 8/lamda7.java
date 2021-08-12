
import java.util.HashMap;
import java.util.Map;

public class lamda7 {

	public static void main(String[] args) 
	{
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Anjali");  
		  map.put(101,"Shweta");  
		  map.put(102,"Riya"); 
		  
		  System.out.println(map);
		  
		  StringBuilder A=new StringBuilder("");
		  
		  for(Map.Entry m:map.entrySet()) {
			  
			  A.append(m.getKey());
			  A.append(m.getValue());
		  }
		  System.out.println(A);

	}
}
