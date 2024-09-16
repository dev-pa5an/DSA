import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(24);
        nums.add(39);
        nums.add(61);
        nums.add(83);

        Comparator<Integer> comparator = (Comparator<Integer>) (Integer i, Integer j) -> {
            if (i%10 > j%10)
                return 1;
            else
                return -1;
        };

        Collections.sort(nums, comparator); //used TimSort algorithm
        System.out.println(nums);
    }
}