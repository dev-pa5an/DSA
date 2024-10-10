import java.util.List;

public class SecondMax {
    public static int findSecondMax(List<Integer> arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (Integer i : arr) {
            
            if (i > max){
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }
        }

        return secondMax;
    }
}
