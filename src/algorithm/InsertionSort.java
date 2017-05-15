package algorithm;

/**
 * Created by Ethan on 2017/4/29.
 */
public class InsertionSort {
    public static void sortInASC(int[] numbers){
        for(int j = 1; j < numbers.length; j++){
            int key = numbers[j];
            int i = j - 1;
            while(i >= 0 && numbers[i] > key){
                numbers[i + 1] = numbers[i];
                i = i - 1;
            }
            numbers[i + 1] = key;
        }
    }
}
