import java.util.List;

public class ReverseAnArray{

    public static List<Integer> reverseArray(List<Integer> arr, int start, int end){
        
        while(start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
        return arr;
    }

}