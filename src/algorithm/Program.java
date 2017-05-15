package algorithm;

/**
 * Created by Ethan on 2017/4/29.
 */
public class Program {
    public static void main(String args[]){
        int[] numbers = new int[]{10, 9, 8, 6, 1, 2, 3, 7, 5, 4};
        printIntArray(numbers);
        InsertionSort.sortInASC(numbers);
        printIntArray(numbers);
    }

    public static void printIntArray(int [] numbers){
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            System.out.print(' ');
        }
    }
}
