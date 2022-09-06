package Arrays.AutoboxingVsUnboxing;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String[] strAray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();

        // can't do it, must be class, not primitive
//        ArrayList<int> intArrayList = new ArrayList<int>();


        //autoboxing - wrapping primitive types in classes
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        Integer integer = 54;
        Double doubleValue = 12.25;
        intArrayList.add(integer);
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        //unboxing
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());
        }

        Integer myInValue = 56;
        int myInt = myInValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for (double i = 0; i <= 10.0; i+= 0.5) {
            myDoubleValues.add(i);
        }
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " ---> " + value);
        }
    }
}
