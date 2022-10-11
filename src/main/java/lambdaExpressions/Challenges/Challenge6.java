package lambdaExpressions.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Challenge6 {

    public static void main(String[] args) {

        Supplier<String> loveJava = () -> "I love java!";
        String iLoveJava = loveJava.get();
        System.out.println(iLoveJava);

        Callable callable1 = () -> {

            return null;
        };

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> topNames2015v2 = new ArrayList<>(topNames2015);
        topNames2015v2.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.toList());
        topNames2015v2.sort(String::compareTo);

        topNames2015.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).sorted().forEach(System.out::println);
        System.out.println(topNames2015.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).sorted().filter(s -> s.startsWith("A")).count());

        System.out.println("Challenge 13,14");
        topNames2015.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).peek(System.out::println).collect(Collectors.toList());
        System.out.println(topNames2015.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).peek(System.out::println).count());


//        challenge 13


    }
}
