package javaStream;

import java.util.ArrayList;import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Fruits{
	String name;
	int price;
	int calories;
	String color;
	public Fruits(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.color = color;
		this.calories = calories;
		this.price = price;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
}
public class Stream1 {

	public static void main(String[] args) {
		Fruits f1=new Fruits("Apple",100,120,"Red");
		Fruits f2=new Fruits("Guva",80,80,"Green");
		Fruits f3=new Fruits("Orange",50,150,"Orange");
		Fruits f4=new Fruits("Mango",70,250,"Yellow");
		Fruits f5=new Fruits("Lemon",50,10,"Yellow");
		Fruits f6=new Fruits("RedApple",50,200,"Red");
		Fruits f7=new Fruits("RedMango",50,250,"Red");
		
		List<Fruits> fruit=new ArrayList<>();
		fruit.add(f1);
		fruit.add(f2);
		fruit.add(f3);
		fruit.add(f4);
		fruit.add(f5);
		fruit.add(f6);
		fruit.add(f7);
		
	     //Question:1
		
		System.out.println("Low calories fruits");
		fruit.stream().filter(A -> A.calories < 100).forEach(A-> System.out.println(A.name));
		
		//Question:2
		
		System.out.println("colour wise fruits");
		List<Fruits> Color=fruit.stream().sorted(Comparator.comparing(Fruits::getColor)).collect(Collectors.toList());
		Color.forEach(System.out::println);
		
		//Question:4
		
		System.out.println("red colour fruits");
		List<Fruits> RedFruit=fruit.stream().filter(P -> P.color=="Red").sorted(Comparator.comparing(Fruits::getPrice)).collect(Collectors.toList());
		RedFruit.forEach(System.out::println);
	}
}
	 
