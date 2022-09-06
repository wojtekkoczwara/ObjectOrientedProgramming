package Arrays;

import java.util.Scanner;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i]=i*10;
        }

        printArray(myIntArray);
//        int [] myIntArray =  {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};

        myIntArray[0] = 45;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        System.out.println(myIntArray[4]);
        System.out.println(myIntArray[6]);
        System.out.println(myIntArray[8]);

        System.out.println("--------------------------------");

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[ ] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        return (double) sumTotal / (double) array.length;
    }
}
