package StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of Strings convert all strings to uppercase
 * and then concatenate them into a single string
 */
public class Question39 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        String collect = list.stream().map(String::toUpperCase).collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
