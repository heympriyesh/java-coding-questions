package StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Print distinct numbers which starts with "1" in descending order
 */
public class Question42 {
    public static void main(String[] args) {
        int[] arr={12,34,11,34,67,121,121,52,78,114,565,1643,11};
        List<Integer> list = Arrays
                .stream(arr)
                .boxed()
                .map(String::valueOf)
                .filter(x -> x.charAt(0) == '1')
                .map(Integer::valueOf)
                .distinct()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);
//        2 Approach
        List<Integer> list1 = Arrays.stream(arr)
                .distinct()
                .filter(x -> String.valueOf(x).startsWith("1"))
                .boxed()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println(list1);

    }
}
