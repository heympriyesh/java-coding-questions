package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 *Find the sum of all the elements in a list.
 */
public class Question25 {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5);
//        1. Solution
        Integer reduce = num.stream().reduce(0, (x, y) -> x + y);
//      2. Solution
        int sum = num.stream().mapToInt(x -> x).sum();
        System.out.println(reduce);
        System.out.println(sum);
    }
}
