
import java.util.ArrayList;
import java.util.List;

public class lamda4 {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("Anjali");
		name.add("Aishu");
		name.add("pooja");
		name.add("Ankita");
		name.add("shweta");
		
		System.out.println("Beore removing "+name);
		
		name.removeIf(A -> (A.length()%2==1));
		System.out.println("after removing  "+name);
	}

}
