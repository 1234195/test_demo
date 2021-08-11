
import java.util.*;


class students {


	private int marks;
	private String name;
    private int ID;
  	private String Department;

	// constructor
	public students(int value, String name,int ID,String Department)
	{
		this.marks=value;
		this.name=name;
        this.ID=ID;
        this.Department=Department;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	
	public int getMarks()
	{
		return marks;
	}
  	public String getDepartment()
	{
		return Department;
	}
    public int getID()
	{
		return ID;
	}
  
	
}

class myMarksComparator implements Comparator<students>
{

	public int compare(students s1, students s2)
	{
		return s1.getMarks()-s2.getMarks();
	}
}

class myDepartmentComparator implements Comparator<students>
{

	public int compare(students s1, students s2)
	{
		return s1.getDepartment().compareTo(s2.getDepartment());
	}
}

class myIDComparator implements Comparator<students>
{

	public int compare(students s1, students s2)
	{
		return s1.getID()-s2.getID();
	}
}


class myNameComparator implements Comparator<students>
{
	public int compare(students s1, students s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}

public class Collection3
{
    void ID()
    {
        TreeSet<students> set = new TreeSet<students>(new myIDComparator());
		
		set.add(new students(450,"Sam",1,"cse"));
		set.add(new students(341,"Ronaldo",2,"ele"));
		set.add(new students(134,"Daniel",3,"cse"));
		set.add(new students(590,"George",4,"mech"));
		
		
		
		// Printing the TreeSet elements
		for(students ele: set)
		{
			System.out.print(ele.getName()+" "+ele.getMarks()+" "+ele.getID() +" "+ele.getDepartment());
			System.out.println();
		}
        
    }
    
    void Name()
    {
        TreeSet<students> set = new TreeSet<students>(new myNameComparator());
		
		set.add(new students(450,"Sam",1,"cse"));
		set.add(new students(341,"Ronaldo",2,"ele"));
		set.add(new students(134,"Daniel",3,"cse"));
		set.add(new students(590,"George",4,"mech"));
		
		
		
		// Printing the TreeSet elements
		for(students ele: set)
		{
			System.out.print(ele.getName()+" "+ele.getMarks()+" "+ele.getID() +" "+ele.getDepartment());
			System.out.println();
		}
    }
    

    void Deparment()
    {
      TreeSet<students> set = new TreeSet<students>(new myDepartmentComparator());
		
		set.add(new students(450,"Anju",1,"cse"));
		set.add(new students(341,"Anja",2,"IT"));
		set.add(new students(134,"pooja",3,"cse"));
		set.add(new students(590,"Pratik",4,"mech"));
		
	
}
    void Salary()
    {
        TreeSet<students> set = new TreeSet<students>(new myMarksComparator());
		
		set.add(new students(450,"Sam",1,"cse"));
		set.add(new students(341,"Ronaldo",2,"ele"));
		set.add(new students(134,"Daniel",3,"cse"));
		set.add(new students(590,"George",4,"mech"));
		set.add(new students(690,"Mike",6,"chem"));
		set.add(new students(290,"Alien",5,"megatronic"));
		
		
		
		
		// Printing the TreeSet elements
		for(students ele: set)
		{
			System.out.print(ele.getName()+" "+ele.getMarks()+" "+ele.getID() +" "+ele.getDepartment());
			System.out.println();
		}  
    }
    
    
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("a) ID \n"+"b) Name \n"+"c) Deparment \n"+"d) Salary");
		char option = sc.next().charAt(0);
		Collection3 mi = new Collection3();
		switch(option)
	    {
	        case 'a':mi.ID();
	               break;
	        case 'b':mi.Name();
	                break;
	        case 'c':mi.Deparment();
	                break;
	        case 'd':mi.Salary();
	                break;
	  	}
	}
}
