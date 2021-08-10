package javaFirstProject;

 class Emp {

	int totalSal;
	public int salary(int fixSal,int overTimeSal) 
	{
		totalSal=fixSal+overTimeSal;
		
		return totalSal;
	}
}

class Manager extends Emp
{
	int TotalMSal;
	
	public int salary(int fixSal,int overTimeSal)
	{
		TotalMSal=fixSal+overTimeSal;
		return TotalMSal;
	}
}

class labour extends Emp
{
	int totalLSal;
	public int salary(int fixSal,int overTimeSal)
	{
		totalLSal=fixSal+overTimeSal;
		return totalLSal;
	}	

}
public class Employee {

	public static void main(String[] args)
	{
		int TotalSalary;
		Emp M=new Manager();
		Emp L=new labour();
		TotalSalary=M.salary(15000, 1000)+L.salary(80000, 700);
		System.out.println("Total salary of employee is "+TotalSalary);

	}
	
	
}
