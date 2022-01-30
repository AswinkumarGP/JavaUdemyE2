package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main{

    int[] array = new int[5];
    int[] sortedArray = new int[5];
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Main main = new Main();
        main.getIntegers();
        main.printArray(main.array);
        main.sortIntegers(main.array);
        main.printArray(main.sortedArray);

    }

    public void getIntegers(){
        System.out.println("Enter numbers \r");
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
    }

    public void printArray(int[] array){
        System.out.println("Array : ");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void sortIntegers(int[] array){
        int temp;
        sortedArray = Arrays.copyOf(array, array.length);
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
    }

}
