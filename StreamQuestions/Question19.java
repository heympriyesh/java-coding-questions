package StreamQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group /Pair anagrams from a list of Strings.
 */
public class Question19 {
    public static void main(String[] args) {
         String[] str={"pat","tap","pan","nap","Team","tree","meat"};
        Collection<List<String>> values = Arrays
                .stream(str)
                .collect(Collectors
                        .groupingBy
                                (x ->
                                        Arrays
                                                .stream(
                                                        x.toLowerCase()
                                                                .split(""))
                                                .sorted()
                                                .collect(
                                                        Collectors
                                                                .toList()))).values();
        System.out.println(values);

    }
}
