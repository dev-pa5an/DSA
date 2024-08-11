public class MergeSort{

    public static void mergeSort(int[] arr, int p, int r){
        if (p >= r){
            return;
        }
        int q = (p + r) / 2;

        mergeSort(arr, p, q);
        mergeSort(arr, q + 1, r);
        merge(arr, p, q, r);
        
    }
    public static void merge(int[] arr, int p, int q, int r){
        int nL = q - p + 1;
        int nR = r - q;

        int[] L = new int[nL];
        int[] R = new int[nR];

        System.arraycopy(arr, p, L, 0, nL);
        System.arraycopy(arr, q + 1, R, 0, nR);

        // for (int i = 0; i < nL; i++){
        //     L[i] = arr[p + i];
        // }
        // for (int j = 0; j < nR; j++){
        //     R[j] = arr[q + 1 + j];
        // }
        printArray(L);
        printArray(R);

        int i = 0, j = 0, k = p;

        while (i < nL && j < nR){
            if (L[i] < R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < L.length){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length){
            arr[k] = R[j];
            j++;
            k++;
        }
        System.out.println("successfully merged!");
        
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,2,1,3,8,4,7};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
