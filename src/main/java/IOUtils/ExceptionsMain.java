package IOUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) {
//        divide(6, 0);
//        divideEAFP(5, 0);
//        divide(5, 0);
        int x = getIntEAFP();
        System.out.println(x);

    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL(){
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer");
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            //iterating over a string :)
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        } if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            return s.nextInt();
        } catch (InputMismatchException e){
            e.printStackTrace();
            return 0;
        }
    }

    private static int divideByLBYL(int x, int y){
        if (y != 0) { return x / y ;}
        else return 0;
    }

    private static int divideEAFP(int x, int y){
        try {
            return x / y;
        } catch (ArithmeticException e){
            e.printStackTrace();
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x / y;
    }
}
