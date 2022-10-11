package lambdaExpressions.Challenges;

import java.util.function.Function;

public class Challenge2_3_5 {
    public static void main(String[] args) {
        Function<String, String> everySecondChar = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };
        System.out.println(everySecondChar.apply("123456789102030"));
        System.out.println(everySecondChar2(everySecondChar, "123456789"));
    }

    public static String everySecondChar(String source){
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }

        return returnVal.toString();
    }

    public static String everySecondChar2(Function<String, String> lambda, String source){
        return lambda.apply(source);
    }

}
