package RegularExpressions.Challenge;

import Classes.AbstractClasses.Exercise47Interface.Parrot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge1 {

    public static void main(String[] args) {
        String challenge1 = "I want a bike";
        String challenge2 = "I want a ball";
        String challenge1Pattern = ".*want a.*";
        String challenge2PatternAlternative = "I want a \\w+";
        Pattern pattern1 = Pattern.compile(challenge1Pattern);
        Matcher matcher = pattern1.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher.reset();
        matcher = pattern1.matcher(challenge2);
        System.out.println(matcher.matches());

//        group solution
        String regExp1 = "I want a (bike|ball)";
        System.out.println(challenge1.matches(regExp1));

        Pattern pattern2 = Pattern.compile(challenge2PatternAlternative);
        Matcher matcher2 = pattern2.matcher(challenge2);
        System.out.println(matcher2.matches());

        String challenge4 = "Replace all blanks with underscores_";
        System.out.println(challenge4.replaceAll("[ ]", "_"));
        System.out.println(challenge4.replaceAll("\\s", "_"));

        System.out.println("Challenge 6 " + "aaabccccccccdddefffg".matches("^a{1,10}b{1}c{1,10}.*$"));

        regExp1 = "^[a-z]+\\.[0-9]+$";
        System.out.println("Challenge 7 " + "abcd.135".matches(regExp1));

        regExp1 = "([a-z]+\\.[0-9]+)";
        String challenge8 = "abcd.135uvqz.7tzik.999";
        System.out.println("Challenge 8 " + challenge8.matches(regExp1));

        Pattern pattern8 = Pattern.compile(regExp1);
        Matcher matcher8 = pattern8.matcher(challenge8);
        System.out.println(matcher8.matches());
        matcher8.reset();

        while (matcher8.find()){
            System.out.println("Occurence: " + matcher8.group(1));
        }

        System.out.println("Challenge 9");
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern9.matcher(challenge9);
        while(matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }


        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);
        while(matcher10.find()) {
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) -1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{([0-9], [0-9])\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);

        while (matcher11.find()){
            System.out.println("Occurence: " + matcher11.group(1));
        }

        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {x, y}, {2, 4}";
        Pattern pattern11a = Pattern.compile("\\{([0-9], [0-9])\\}");
        Matcher matcher11a = pattern11a.matcher(challenge11a);

        while (matcher11a.find()){
            System.out.println("Occurence: " + matcher11a.group(1));
        }

        String challenge12 = "11111";
        Pattern pattern12 = Pattern.compile("^\\d{5}$");
        Matcher matcher12 = pattern12.matcher(challenge12);
        System.out.println(matcher12.matches());

        String challenge13 = "11111-1111";
        Pattern pattern13 = Pattern.compile("^\\d{5}-\\d{4}$");
        Matcher matcher13 = pattern13.matcher(challenge13);
        System.out.println(matcher13.matches());

        String challenge14a = "11111-1111";
        Pattern pattern14a = Pattern.compile("^\\d{5}-(\\d{4})?$");
        Matcher matcher14a = pattern14a.matcher(challenge14a);
        System.out.println(matcher13.matches());
        
    }
}
