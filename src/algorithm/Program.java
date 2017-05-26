package algorithm;

/**
 * Created by Ethan on 2017/4/29.
 */
public class Program {
    public static void main(String args[]) throws Exception {
        // insert sort
        int[] numbers_1 = new int[100];
        generateArray(numbers_1);
        printIntArray(numbers_1);

        InsertionSort.sortInASC(numbers_1);
        printIntArray(numbers_1);

        // merge
        int[] numbers_5_1 = new int[]{1,4,5,9,11,28,30,33,2,4,20,33,34,55,66};
        printIntArray(numbers_5_1);
        MergeSort.mergeInASC(numbers_5_1, 0, 7, numbers_5_1.length - 1);
        printIntArray(numbers_5_1);

        int[] numbers_5_2 = new int[]{2,3,8,11,1,4,5,9,11,28,30,33,2,4,20,33,34,55,66};
        printIntArray(numbers_5_2);
        MergeSort.mergeInASC(numbers_5_2, 4, 11, numbers_5_2.length - 1);
        printIntArray(numbers_5_2);
    }

    public static void generateArray(int[] number)
    {
        for(int i = 0; i < number.length; i++){
            double d = Math.random();
            int n = (int)(d * 100);
            number[i] = n;
        }
    }

    public static void printIntArray(int [] numbers){
        System.out.println();
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            System.out.print(' ');
        }
    }
}
