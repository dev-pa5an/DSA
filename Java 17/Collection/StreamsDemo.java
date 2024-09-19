
import java.util.Arrays;
import java.util.List;

public class StreamsDemo{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,6,3,1,9,8);
        
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e) -> c+e);

        int result = nums.stream()
                            .filter(n -> n%2==0)
                            .map(n -> n*2)
                            .reduce(0, (c,e) -> c+e);

        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));
        System.out.println(result);

    }
}