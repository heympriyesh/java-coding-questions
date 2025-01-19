package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * Convert a list of strings to uppercase.
 */
public class Question33 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("breaking bad", "game of thrones", "big bang theory");
        List<String> list1 = list.stream().map(String::toUpperCase).toList();
        System.out.println(list1);
    }
}
