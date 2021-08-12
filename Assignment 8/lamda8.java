
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
class Main extends Thread{  
    public void run(){  
    	
    	System.out.println("abcd");
    }
      
    public static void main(String[] args){ 
        
        Main t1=new Main();  
        t1.start();  
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
        
        Consumer<List<Integer> >
            dispList = lis -> lis.stream().forEach(a -> System.out.print(a + " "));
            
        dispList.accept(list);
    
    }  
}  

