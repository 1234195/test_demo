import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
 class Emp {

	private String name;
    private String Email;
    
    public Emp(String name,String Email){
        this.Email = Email;
        this.name = name;
    }
 
    public String getEmail() {
        return Email;
    }
 
    public String getName() {
        return name;
    }
    
    
    public String toString(){
        return "[" + this.getName() + "=>" + this.getEmail() + "]";
    }
}
 
public class Collection1 {
 
    public static void main(String[] args) {
        
        TreeMap<Long, Emp> tmapEmployees = new TreeMap<Long, Emp>();
        
        tmapEmployees.put(7447554209L, new Emp("Anjali","rabade@gmail.com"));
        tmapEmployees.put(9881066668L, new Emp("Rita","preeti@outlook.com"));
        tmapEmployees.put(8308571522L, new Emp("Sneha","s@gmail.com"));
        
        Set<Long> keys = tmapEmployees.keySet();
        
        
        System.out.println("Printing all keys of TreeMap");
        for(Long key : keys){
            System.out.println( key );
        }
        
     
        Set<Map.Entry<Long, Emp>> entrie = tmapEmployees.entrySet();
        
        System.out.println("Printing all keys of TreeMap");
        for(Map.Entry<Long, Emp> entry : entrie)
        {
            System.out.println(entry.getValue() );
        }
        
        System.out.println("\n");
        
        
        Set<Map.Entry<Long, Emp>> entries = tmapEmployees.entrySet();
        
        System.out.println("Printing all keys and values of TreeMap");
        for(Map.Entry<Long, Emp> entry : entries){
            System.out.println( entry.getKey() + "=>" + entry.getValue() );
        }
    }
}
	
