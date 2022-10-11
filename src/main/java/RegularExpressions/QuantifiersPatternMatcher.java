package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifiersPatternMatcher {
    public static void main(String[] args) {
        String thirdalphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        quantifier - we want abcDeee (3 e's)
        System.out.println(thirdalphanumeric.replaceAll("^abcDe{3}", "YYY"));
// quantifier - +  - one or more symbols of e (e+)
        System.out.println(thirdalphanumeric.replaceAll("^abcDe+", "YYY"));
//        zero or more e's:  *e
        System.out.println(thirdalphanumeric.replaceAll("^abcDe*", "YYY"));

//        e should be on 2-5 numbers
        System.out.println(thirdalphanumeric.replaceAll("^abcDe{2,5}", "YYY"));

//        replace more complicated occurences
        System.out.println(thirdalphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());
        matcher.reset();
        int count = 0;
        while (matcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern pattern1 = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = pattern1.matcher(htmlText);
        System.out.println("h2 tags matcher");
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Ocurence: " + groupMatcher.group(1));
        }

//        multiple groups
        String h2Ttextgroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2Ttextgroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurence: " + h2TextMatcher.group(2));
        }


//        "abc" -> "a" and "b" and "c"
//        or: [Hh]arry
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
//        when ^ on square braces it means NOT, as similar as !
        String tvTest = "tstvtkt";
//        t followe by any character other than v (must be character)
        String tNotVRegExp = "t[^v]";
//        t not followed by v
        String tNotVRegExp2 = "t(?|v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println("Occurence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

//        US phone number pattern
// ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$

        String phone1 = "1234567890";  // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

//        visa
        // ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));

    }
}
