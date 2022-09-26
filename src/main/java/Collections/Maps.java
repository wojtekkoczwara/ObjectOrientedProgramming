package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an intepreted, object-oriented, high level programming language with dynamic semtnatics");
        languages.put("Algol", "an algorythmic language");
        languages.put("BASIC", "Beginner All Purposes SYmbolic Instruction code");
        languages.put("Lisp", "Therein lies madness");

        System.out.println(languages.get("Java"));
        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about java");
        System.out.println(languages.get("Java"));

        System.out.println(languages.containsKey("Java"));
//        checking and adding if not present
        languages.putIfAbsent("Java", "aaa");

//        print map

//        languages.remove("Lisp");
        if(languages.remove("Algol", "a family of algorythmic languages")){
            System.out.println("ALgol removed");
        } else {
            System.out.println("ALgol not removed. key value pair not found");
        }

        System.out.println("----------------------------");

        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

        if(languages.replace("Lisp", "Therein lies madness", "lisp is a languagr imprtative")){
            System.out.println("lisp replaced");
        } else {
            System.out.println("lisp not replaced");
        }

    }
}
