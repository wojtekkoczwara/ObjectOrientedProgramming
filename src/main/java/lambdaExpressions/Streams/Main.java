package lambdaExpressions.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        Department hr = new Department("Human resources");
        hr.addEmployee(jack);
        hr.addEmployee(tim);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(red);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream().flatMap(department -> department.getEmployees().stream()).forEach(System.out::println);

        Map<Integer, List<Employee>> groupedByAge = departments.stream().
                flatMap(department -> department.getEmployees().stream()).collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream().flatMap(department -> department.getEmployees().stream()).reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST").filter(s -> {
            System.out.println(s);
            return s.length() == 3;
        }).count();
    }
}
