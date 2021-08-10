package javaGenerics;
import java.util.HashSet;
import java.util.Set;

class Employee {

	private int id;
    private String name;
    private int salary;
    private String department;
 
    public Employee(int id,String name, int salary,String department)
    {
    	 this.id = id;
          this.name = name;
         this.salary = salary;
         this.department = department;
    }
 
    public String toString()
    {
        return "{" +
                "id='" + id +'\'' +
                "name='" + name + '\'' +
                ", salary=" + salary +'\''+",department="+ department+
                '}';
    }
}

class Generics1
{
    public static void main(String[] args)
    {
        Employee a = new Employee(1,"Anjali",20000,"IT");
   
        Set<Employee> emp = new HashSet<>();
        emp.add(a);
      
 
        System.out.println(emp);
    }
	
	
	
}
