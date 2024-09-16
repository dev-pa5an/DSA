import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps{
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Pasan", 10);
        students.put("Yasith", 9);

        //hashtable is suitable to work with multiple threads.
        //hashtable is synchronized
        Map<String, Integer> fruits = new Hashtable<>();
        fruits.put("promegranante", 4);
        fruits.put("orange", 6);


        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
        
    }
}