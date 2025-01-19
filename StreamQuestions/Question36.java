package StreamQuestions;

import StreamQuestions.ClassFolder.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * There is a list of Employee object having field name
 * and email. Find the list of domains (gmail.com,yahoo.com etc.)
 * And the occurrence of each domain.
 */
public class Question36 {
    public static void main(String[] args) {
        Employee e1=new Employee("Sam","sam@gmail.com");
        Employee e2=new Employee("Adam","adam@yahoo.com");
        Employee e3=new Employee("Peter","peter@gmail.com");

        List<Employee> employees=new ArrayList<>(Arrays.asList(e1,e2,e3));
        System.out.println(employees);
        Map<String, Long> collect = employees
                .stream()
                .map(x -> x.getEmail().substring(x.getEmail().indexOf("@")))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);
    }
}
