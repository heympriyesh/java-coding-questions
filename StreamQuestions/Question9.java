package StreamQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *  Given a word, find the occurrence of each character
 */
public class Question9 {
    public static void main(String[] args) {
        String s="Mississipi";
        Map<String, Long> collect = Arrays
                .stream(s.split(""))
                .collect(Collectors
                        .groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);
    }
}
