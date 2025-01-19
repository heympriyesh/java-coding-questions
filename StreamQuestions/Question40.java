package StreamQuestions;

import java.util.List;
import java.util.stream.Stream;

/**
 * Concatenate 2 Strings
 */
public class Question40 {
    public static void main(String[] args) {
        Stream<String> java = Stream.of("Java", "Python");
        Stream<String> stringStream = Stream.of("C++", "C#");
        List<String> list = Stream.concat(java, stringStream).toList();
        System.out.println(list);
    }
}
