package StreamQuestions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Write a program to group words by their length and then, for each group, count the number of unique first characters
 */
public class Question16 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "kiwi");
        Map<Integer, Integer> collect = words
                .stream()
                .collect(
                        Collectors.groupingBy(String::length,
                                Collectors.mapping(
                                        word -> word.charAt(0),
                                        Collectors.collectingAndThen(
                                                Collectors.toSet(),
                                                Set::size
                                        )
                                )));
        System.out.println(collect);
    }
}
