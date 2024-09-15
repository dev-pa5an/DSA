import java.util.HashMap;
import java.util.Map;

public class Maps{
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Pasan", 10);
        students.put("Yasith", 9);


        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
        
    }
}