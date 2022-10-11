package lambdaExpressions.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList
                ("N40", "N36", "B12", "B6", "G59", "G49", "G60", "G50", "g64", "I26", "I17", "I29", "071");

        List<String> gNumbers = new ArrayList<>();

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N46", "I26", "I17", "I29", "O71");

        //        collect method
        List<String> someGNumbers = someBingoNumbers.stream().map(String::toUpperCase).
                filter(s -> s.startsWith("G")).sorted().collect(Collectors.toList());

        List<String> someGNumbers2 = someBingoNumbers.stream().map(String::toUpperCase).
                filter(s -> s.startsWith("G")).sorted().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s: someGNumbers2
             ) {
            System.out.println(s);
        }

    }
}
