package lambdaExpressions.FunctionalProgramming;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        //    enhanced for
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

//        filter by age - over 30
//        System.out.println("Employees over 30");
//        for(Employee employee: employees){
//            if(employee.getAge() > 30){
//                if(employee.getAge() > 30){
//                    System.out.println(employee.getName());
//                }
//            }
//        }
        employees.forEach(employee -> {
            if (employee.getAge() > 30){
                System.out.println(employee.getName());
            }
        });

//        same with extra lambda
        printEmployee(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployee(employees, "Employees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 25;
            }
        });

        IntPredicate greaterThan15 = i ->
        {
            System.out.println("\n");
            return i > 15; };
        IntPredicate lessThan100 = i -> i < 100;
        System.out.println(greaterThan15.test(10));

//        chaining - awesome :)
        System.out.println(greaterThan15.and(lessThan100).test(50));

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(1000));
        }


//        same with lambda - supplier type
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }

//        print last name of employees with lambda
        employees.forEach(employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(" ") + 1);
            System.out.println("Last name is: " + lastName);
        });

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
