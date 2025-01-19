package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * Convert a list of integers to a list of their squares
 */
public class Question27 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        List<Integer> list = Arrays.stream(arr).boxed().map(x -> x * x).toList();
        System.out.println(list);
    }
}
