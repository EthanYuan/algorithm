package algorithm;

/**
 * Created by Ethan on 2017/5/26.
 */
public class MergeSort {
    public static void mergeInASC(int[] numbers, int p, int q, int r) throws Exception {
        if(numbers.length < 2 || p > q || q >= r)
            throw new Exception("Para error.");

        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for(int i  = 0; i < n1; i++){
            L[i] = numbers[p + i];
        }
        for(int j = 0; j < n2; j++){
            R[j] = numbers[q + 1 + j];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++){
            if(L[i] > R[j]){
                numbers[k] = R[j];
                j++;
            }
            else{
                numbers[k] = L[i];
                i++;
            }
        }
    }
}
