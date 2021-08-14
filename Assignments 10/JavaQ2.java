package java11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaQ2 {

	
		public static void main(String[] args) {
			
			String s = "A quik brown fox jumps over the lazy dog";

			List<String> L = new ArrayList<String>(Arrays.asList(s.split(" ")));

			System.out.println(L);

		}

	}
	
	

