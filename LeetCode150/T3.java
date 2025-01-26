
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T3 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(t3.groupAna(strs));
    }
    public List<List<String>> groupAna(String[] strs){
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> ansMap = new HashMap<>();
        List<Integer> freqs = new ArrayList<>(26);

        for (String s : strs){
            freqs.replaceAll(e -> 0);
            for (char c : s.toCharArray()){
                freqs.set(c - 'a', freqs.get(c - 'a') + 1);
            }
            String key = freqs.toString();
            // if (!ansMap.containsKey(key)){
            //     ansMap.put(key, new ArrayList<>());
            // }
            // ansMap.get(key).add(s);
            ansMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(ansMap.values());
    }
}
