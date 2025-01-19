package StreamQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * In a given array of integers, return true if it contains distinct values
 */
public class Question23 {
    public static void main(String[] args) {
        int[] arr={5,0,1,0,8,0};
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        Collection<Long> view=collect.values();
        boolean distinctChecker = view.stream().noneMatch(x -> x > 1);
        System.out.println(distinctChecker);
    }
}
