package java11;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class JavaQ4 {

	public static void main(String[] args) {
	
	var path="C:\\Java assignment\\java11\\Java11AssignmentsStudent_list.txt";
	File F = new File("C:\\\\Java assignment\\\\java11\\\\Java11AssignmentsStudent_list.txt");
  
    
	try 
	{
	
		BufferedReader br = new BufferedReader(new FileReader(F));
		  
		  String line;
		  System.out.println("Reading Data From File");
		  while ((line = br.readLine()) != null)
		    System.out.println(line);
		  
		  System.out.println("After Removing Whitspace From File");
		  Files.lines(new File("C:\\\\Java assignment\\\\java11\\\\Java11AssignmentsStudent_list.txt").toPath())
		    .map(s -> s.trim())
		    .filter(s -> !s.isEmpty())
		    .forEach(System.out::println);
		  
		     System.out.println("Total Count of Students"); 
		     Long count= Files.lines(new File("C:\\\\Java assignment\\\\java11\\\\Java11AssignmentsStudent_list.txt").toPath())
				 .map(s -> s.trim())
				 .filter(s -> !s.isEmpty()).count();
		 
		 System.out.println(count);
	} 
	catch (FileNotFoundException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}

