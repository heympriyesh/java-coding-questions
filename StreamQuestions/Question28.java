package StreamQuestions;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Find and print the distinct odd numbers
 */
public class Question28 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,9,9,10};
        Set<Integer> collect = Arrays.stream(arr).boxed().filter(x->x%2!=0).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
