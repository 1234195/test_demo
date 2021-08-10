package javaGenerics;

public class GenericsQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//problem:1
		Pair<String,String> A=new Pair<>();
		A.setKey("1");
		A.setValue("Hello");
		
		System.out.println("For first pair Key is "+A.getKey()+" and value is "+A.getValue());
		
		//Problem:2
		
		Pair<String,java.util.Date> B=new Pair<>();
		B.setKey("Today is ");
		
		B.setValue(new java.util.Date());
		
		System.out.println("For Second pair Key is "+B.getKey()+" and value is "+B.getValue());
	}
		

	}



