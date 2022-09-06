package Arrays;

import java.util.Arrays;

public class ReferencevsValue {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("AnotherIntValue = " + anotherIntValue);

        anotherIntValue++;


        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("AnotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println(myIntArray + " ---" + anotherArray);

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("myIntArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println(" after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change myIntArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[]{3,4,5,6,7};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify myIntArray= " + Arrays.toString(anotherArray));

        System.out.println(myIntArray + " ----------- " + anotherArray);
    }

    private static void modifyArray(int [] array){

        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5};
    }
}
