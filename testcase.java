import java.util.HashMap;
import java.util.Map;

public class Hashmap {

public static void main(String[] args) {

System.out.println("the Testcase id's are in numbers");

HashMap<Integer,String> map=new HashMap<Integer,String>();  
  map.put(1,"pass");  
  map.put(2,"fail");    
  map.put(3,"fail");  
  map.put(4,"pass");
  map.put(5, "fail");
  map.put(6,"pass");
       
int length=map.size();
System.out.println("THE RESULTS ARE:");
for(int i = 0;i<length;i++)
{
if(map.values().toArray()[i].equals("pass"))
 {
 System.out.println("the successful id's are:"+map.keySet().toArray()[i]);
 }
 else {
 System.out.println("the failed id's are:"+map.keySet().toArray()[i]);
 }
}
}
}
