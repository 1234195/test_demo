import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class lamda5 {



	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Anjali");
		name.add("Shweta");
		name.add("Aishu");
		name.add("puja");
		name.add("priya");
		
		StringBuffer  S=new StringBuffer("");
		Consumer<List<String>> modify= list ->
		{
			Iterator<String> it=list.iterator();
			while(it.hasNext()) 
			{
				String str=it.next();
				S.append(str.charAt(0));
			}	
		};
		
		modify.accept(name);
		
		System.out.println(S);

	}
}

