package java11;
import java.io.*;
import java.util.*;

 class Items {
	
     String id;
	String name;
	double price;
	double total;
	int qty;
	

	Items(String x, String y, String z, String p) {

		name = y;
		id = x;
		int q = Integer.parseInt(z);
		price = Double.parseDouble(p);
		total = q * price;
	}

	public String toString()
	{
		String str = name + " " + id + " " + qty + " " + price + " " + total;
		return (str);
	}

	public static void search(Items[] arr, int n) throws IOException 
	{

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s = b.readLine();

		for (int i = 0; i < n; i++) 
		{
			if (arr[i].name.equals(s))
			{
				System.out.println(arr[i].toString());
				return;
			}
		}

		System.out.println(" Records not Found");

	}

	public static void searchc(Items[] array, int n) {
		double max = 0;
		int c = 0;
		for (int i = 0; i < n; i++)
		{
			if (array[i].price > max) 
			{
				c = i;
			}
		}
		System.out.println(array[c].toString());
	}
}

public class JavaQ5 
{
	public static void main(String[] args) throws IOException 
	{
		String s, space = " ";
		int c, i;
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter No of Products");

		int n = Integer.parseInt(b.readLine());

		System.out.println("1: Insert Product Records:\n<id> <name> <price> <q> :");

		FileWriter f = new FileWriter("item.dat");
		for (i = 0; i < n; i++)
		{
			s = b.readLine() + "";
			f.write(s);
		}

		f.close();

		Items it[] = new Items[10];
		FileReader fr = new FileReader("item.dat");
		BufferedReader br = new BufferedReader(fr);

		for (i = 0; i < n; i++)
		{
			s = br.readLine();
			StringTokenizer t = new StringTokenizer(s, space);
			String S1 = new String(t.nextToken());
			String S2 = new String(t.nextToken());
			String S3 = new String(t.nextToken());
			String S4 = new String(t.nextToken());
			it[i] = new Items(S1, S2, S3, S4);
		}

		do {
			System.out.println("Menu" + "2:View Purchase Total \n3:Exit\n" + "Choice :");
			c = Integer.parseInt(b.readLine());

			switch (c) {

			case 2:
				for (i = 0; i < n; i++)
					System.out.println(it[i].toString());
				break;

			case 3:
				System.out.println("Exit Program");
				break;

			default:
				System.out.println("Invalid Option");
			}
		} while (c != 3);
	

}
}
	
