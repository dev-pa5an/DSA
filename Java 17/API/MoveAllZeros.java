import java.util.List;

public class MoveAllZeros {
    public static List<Integer> moveAllZeros(List<Integer> arr){
        int j = 0; // j is looking for zeros
        for (int i = 0; i < arr.size(); i++) { //i is looking for non zero values
            if (arr.get(i) != 0 && arr.get(j) == 0){
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
            if (arr.get(j) != 0){
                j++;
            }
            
        }

        return arr;
    }
}
