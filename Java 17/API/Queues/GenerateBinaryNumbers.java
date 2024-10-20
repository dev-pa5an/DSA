import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers{
    public static String generateBinaryNumbers(int n){
        ArrayList<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++){
            result.add(queue.poll());
            String s1 = result.get(i) + "0";
            String s2 = result.get(i) + "1";
            queue.offer(s1);
            queue.offer(s2);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println("Binary numbers from 1 to 5 is " + generateBinaryNumbers(5));
    }
}