public class Sorting {
    public static int searchVal(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high){
            mid = low + (high - low) / 2;
            if (target == mid) return mid;
            if (target < mid){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static void insertionSort(int[] arr){
        int key, j;
        for (int i = 1; i < arr.length; i++){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    private static void conquer(int[] arr, int[] temp, int low, int mid, int high){
        for (int i = low; i <= high; i++){
            temp[i] = arr[i];
        }
        int i = low; int j = mid + 1; int k = low;
        while (i <= mid && j <= high){
            if (temp[i] > temp[j]){
                arr[k] = temp[j];
                j++;
            } else {
                arr[k] = temp[i];
                i++;
            }
            k++;
        }
        while (i <= mid){
            arr[k] = temp[i];
            i++;
            k++;
        }
    }
    private static void divide(int[] arr, int[] temp, int low, int high){
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        divide(arr, temp, low, mid);
        divide(arr, temp, mid + 1, high);
        conquer(arr, temp, low, mid, high);
    }
    public static void mergesort(int[] arr){
        int[] temp = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        divide(arr, temp, low, high);
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,5,3,7,1,4,6};
        // insertionSort(arr);
        // System.out.println("this is insertion sort");
        // for (int n : arr){
        //     System.out.print(n + " ");
        // }

        //merge sort
        mergesort(arr);
    }
}
