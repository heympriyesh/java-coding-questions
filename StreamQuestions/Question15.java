package StreamQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group words first by their length and then by their first character.
 */
public class Question15 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "kiwi");
        Map<Integer, Map<Character, List<String>>> collect = words
                .stream()
                .collect(
                        Collectors
                                .groupingBy(
                                        String::length,
                                        Collectors
                                                .groupingBy(word -> word.charAt(0))));

        System.out.println(collect);
    }
}
