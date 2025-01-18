package StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Re-arrange elements to place highest element at front/back
 */
public class Question10 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        First Solution
        Arrays.stream(arr).mapToObj(x->x).sorted().forEach(System.out::print);
//        Second Solution
        Arrays.stream(arr).boxed().sorted().map(x -> "" + x).forEach(System.out::print);
        System.out.println();
//        third Solution
        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).map(x -> "" + x).forEach(System.out::print);
    }
}
