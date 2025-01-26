
import java.util.HashMap;
import java.util.Map;

class T2{
    public static void main(String[] args) {
        

    }
    public boolean  validAna(String s, String t){
        if (s.length() != t.length()) return false;
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            chars.put(c, chars.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (!chars.containsKey(c)) return false;
            chars.put(c, chars.get(c) - 1);
            if (chars.get(c) < 0) return false;
        }
        return true;
    }
}