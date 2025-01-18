package StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a sentence, find the occurrence of each word
 */
public class Question6 {
    public static void main(String[] args) {
        String str="I am learning Streams API in Java Java";
        Map<String, Long> collect = Arrays
                .stream(str.split(" "))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect);
    }
}
