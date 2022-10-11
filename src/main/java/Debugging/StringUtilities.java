package Debugging;

public class StringUtilities {
    private StringBuilder sbuilder = new StringBuilder();
    private int charsAdded = 0;

//    public StringUtilities(StringBuilder sbuilder) {
//        this.sbuilder = sbuilder;
//    }

    public void addChar(StringBuilder sb, char a) {
        sb.append(a);
        charsAdded++;
    }

    public String upperAndPrefix(String str){
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str){
        return str + "_suffix";
    }
}
