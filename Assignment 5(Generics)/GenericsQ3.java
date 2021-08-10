package javaGenerics;
import java.util.ArrayList;
import java.util.List;

public class GenericsQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
        intList.add(30);
        intList.add(15);
        intList.add(85);
        intList.add(40);
        intList.add(60);

        Integer[] intArray = new Integer[intList.size()];
        intArray = intList.toArray(intArray);

		System.out.println("Elements before swapping");
		
		for(Integer a:intArray) 
		{
			System.out.print(a+" ");
		}
		
		swap(intArray,2,4);
		
		System.out.println("Elements After Swapping");
		
		for(Integer a:intArray) {
			
			
			System.out.print(a+" ");
		}
		
	}
	
	public static <M> void swap(M[] arr,int m, int n) {
		M obj=arr[m];
		arr[m]=arr[n];
		arr[n]=obj;
	}
}




class Pair<K,V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
		
		

	}



