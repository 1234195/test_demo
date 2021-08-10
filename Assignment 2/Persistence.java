package javaFirstProject;

abstract class Persistence1 {
	 
	 
	 
	 abstract void persist();
}
class FilePersistence extends Persistence1
{
	 void persist(){System.out.println("persist method is implemented in FilePersistance subclass");}
	 }
                                                                                                                                          
class DatabasePersistence extends Persistence1
{
void persist(){System.out.println("persist method is implemented in DatabasePersistance subclass");}
}

class Persistence{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence1 p=new FilePersistence();
		Persistence1 p1=new DatabasePersistence();
	
		
		p.persist();
		p1.persist();
		
	}

}
