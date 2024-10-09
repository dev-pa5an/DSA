import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        System.out.println("Initial array : " + arr);
        ReverseAnArray.reverseArray(arr, 0, arr.size() - 1); 
        System.out.println("Reversed array : " + arr);
    }
}
