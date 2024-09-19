
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamsDemo{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,6,3,1,9,8);
        
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        Predicate<Integer> predicate = n -> n%2 == 0;
        
        Function<Integer, Integer> function = n -> n*2;

        int result = nums.stream()
                            .filter(predicate)
                            .map(function)
                            .reduce(0, (c,e) -> c+e);

        
        System.out.println(result);

    }
}