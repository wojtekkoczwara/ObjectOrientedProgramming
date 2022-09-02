package Exercises.Exercise34ComplexOperations;

import javax.net.ssl.HostnameVerifier;

public class Main {

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(2, 4);
        complexNumber.add(new ComplexNumber(2,5));
        System.out.println(complexNumber.getReal() + " " + complexNumber.getImaginary());


    }
}
