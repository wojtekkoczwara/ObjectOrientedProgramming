package lambdaExpressions.ChainingFunctions;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow white", 22);
        Employee red = new Employee("Red ridinghood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(" ") + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

//        Get firstname
        Function<Employee, String> getFirstName = (Employee employee) -> employee.getName().substring(0, employee.getName().indexOf(" "));

        Random random1 = new Random();
        for (Employee employee: employees
             ) {
            if(random1.nextBoolean()){
                System.out.println(getName(getFirstName, employee));
            } else {
                System.out.println(getName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(" "));
        Function chainedFunction = upperCase.andThen(firstName);

        System.out.println(chainedFunction.apply(employees.get(0)));

//        next example
        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> name.concat(" " + employee.getAge());

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

//        Incrementing value
        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello world");
    }

    private static String getName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
    }

    public static void printEmployee(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println("\n");
        System.out.println(ageText);
        System.out.println("==================");
        for(Employee employee: employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }

}
