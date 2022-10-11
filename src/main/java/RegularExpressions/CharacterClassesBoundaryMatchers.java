package RegularExpressions;

public class CharacterClassesBoundaryMatchers {
    public static void main(String[] args) {
        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println("Harry".replaceAll("[Hh]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-f3-8]", "X"));
//        turn off cse sensitivity (?i). If string is unicode - add u -> (?iu)
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]", "X"));

//        replace all the numbers
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));

//        shortcut for digits
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));

//        non digits
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        // remove all whitespace \ + \s
        String hasWhitespace = "I have blanks and \t a tab, and also a new line \n here";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));

        System.out.println(hasWhitespace.replaceAll("\\S", ""));

        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\W", "X"));
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));   //word boundaries

    }
}
