package StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of Strings,group them by their first
 * character and count the number of strings in each
 * group.
 */
public class Question38 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry", "avocado");
        Map<Character, Long> collect = list
                .stream()
                .collect(
                        Collectors
                                .groupingBy(x -> x.charAt(0),
                                        Collectors.counting()));
        System.out.println(collect);
    }
}
