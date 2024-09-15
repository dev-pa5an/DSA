
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface{
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);

        System.out.println(nums);

        List<Integer> numsL = new ArrayList<>();
        numsL.add(1);
        numsL.add(2);

        System.out.println(numsL);
        System.out.println("1st element is " + numsL.get(0));

    }
}