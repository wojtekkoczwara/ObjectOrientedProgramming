package RegularExpressions;

public class Main {


    public static void main(String[] args) {

//        string litelar
        String string = "I am a string. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("I", "You");

        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("ijkl99z$", " THE END"));

//        replace all occurences
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));


        System.out.println(alphanumeric.replaceAll("[aei]", " replaced "));

        System.out.println(alphanumeric.replaceAll("[aei][Fj]", " replaced "));
    }
}
