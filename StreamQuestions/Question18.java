package StreamQuestions;

import java.util.Arrays;
import java.util.Optional;

/**
 * Find the products of the first two elements in an array
 */
public class Question18 {
    public static void main(String[] args) {
        int[] arr={12,5,6,9,2,4};
        Optional<Integer> reduce = Arrays
                .stream(arr)
                .boxed()
                .limit(2)
                .reduce((x, y) -> x * y);
        System.out.println(reduce.get());
    }
}
