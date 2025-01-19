package StreamQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given an array of integers, group the numbers by the range
 */
public class Question14 {
    public static void main(String[] args) {
       int[] arr={2,3,10,14,20,24,30,34,40,44,50,54};
        LinkedHashMap<Integer, List<Integer>> collect = Arrays
                .stream(arr)
                .boxed()
                .collect(
                        Collectors
                                .groupingBy(x -> x / 10 * 10,
                                        LinkedHashMap::new, Collectors.toList()));
        System.out.println(collect);
    }
}
