package lambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Thread(new CodeTuRun()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable");
            }
        }).start();

        //    same with lambda
        new Thread(() -> System.out.println("Printing from the Runnable lambda")).start();

        Employee john = new Employee("John doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow white", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        sorting in descending order by name w/o lambda
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

//        for (Employee employee: employees
//             ) {
//            System.out.println(employee.getName());
//        }

//        the same as above with lambda
        Collections.sort(employees, ( Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName()));


        for (Employee employee: employees
             ) {
            System.out.println(employee.getName());
        }

        String sillyString = doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, employees.get(0).getName(), employees.get(2).getName());
        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        String sillyString2 = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString2);

        UpperConcat uc2 = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };

//        Nested Blocks
        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

        String s2 = anotherClass.doSomethingWithLambda();
        System.out.println(s2);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return  uc.upperAndConcat(s1, s2);
    }

//    enhanced for


}


class CodeTuRun implements Runnable {


    @Override
    public void run() {
        System.out.println("Printing from the runnable");
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething(){
        System.out.println("The another class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                System.out.println("The anonymous classes name is: " + getClass().getSimpleName());
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String1", "String2");
    }

    public String doSomethingWithLambda(){
       UpperConcat uc = (s1, s2) -> {
           System.out.println("The lambda expressions class " + getClass().getSimpleName());
           String result = s1.toUpperCase() + s2.toUpperCase();
           return result;
       };
        System.out.println("The another class's name is " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "Sring2");
    }
}