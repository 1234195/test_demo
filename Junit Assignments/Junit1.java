import java.util.Arrays;
public class Junit1 {

	//Question:1
	
		public int[] findMinMax(int[] a)
		{
			Arrays.sort(a);
			int min=a[0];
			int max=a[a.length-1];
			int[] output= {min,max};
			System.out.println(output);
			return output;
		}
		
		//Question:2	
		
		public int getMin(int[] a) {
			Arrays.sort(a);
			int Min=a[0];
			return Min;
		}
		
		public int getMax(int[] a) {
			Arrays.sort(a);
			int Max=a[a.length-1];
			return Max;
		}
	
}

