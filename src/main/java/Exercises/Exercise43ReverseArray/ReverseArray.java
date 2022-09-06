package Exercises.Exercise43ReverseArray;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array){
        int temp;
        int[] arrayCopy = Arrays.copyOf(array, array.length);

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            for (int j = array.length -1; j >=array.length -1 - i; j--) {
                reversedArray[i] = array[j];
            }
        }
        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
    }
}
