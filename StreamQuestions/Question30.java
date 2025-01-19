package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * Find the kth smallest element in a list of integers.
 */
public class Question30 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(7,1,6,2,1,3,4,5);
        int n=3;
        Integer i = list1.stream().sorted().skip(n - 1).findFirst().get();
        System.out.println(i);
    }
}
