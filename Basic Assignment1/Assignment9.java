package javaFirstProject;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String arg[])
	{
	
		int[][] m=new int[3][3];
		
		int sum=0;
		double avrage=0;


		@SuppressWarnings("resource")
		Scanner val=new Scanner(System.in);
		System.out.println("enter the marks for each subject");
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j]=val.nextInt();
				sum=sum+m[i][j];
			}
		}
		avrage=sum/9;
		System.out.println("sum of all subjects is "+sum+" and average is "+avrage );
		for(int i=0;i<m.length;i++)
		{
			sum=0;
			avrage=0;
			for(int j=0;j<m[i].length;j++)
			{
				
				sum=sum+m[j][i];
			}
			System.out.println("sum of marks of "+(i+1)+" subject is "+sum);
			avrage=sum/(m[i].length);
			System.out.println("average of marks of "+(i+1)+" subject is "+avrage);
	      
	        
	        
	}
}
}
	        
	        
	        
	        
	        
	        
	        
	        
	        