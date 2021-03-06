package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static int[] getIntegers(int size){
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
