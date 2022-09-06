package Exercises.Exercise42MinimumElement;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int number){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            if(min > temp){
                min = temp;
            }
        }
        return min;
    }
}
