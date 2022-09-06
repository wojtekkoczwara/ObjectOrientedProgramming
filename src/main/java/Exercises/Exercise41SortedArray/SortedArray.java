package Exercises.Exercise41SortedArray;

import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Enter " + number + " integer values:\r");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = getIntegers(6);
        printArray(array);
        array = sortIntegers(array);
        printArray(array);
    }
}
