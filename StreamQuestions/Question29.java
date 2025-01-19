package StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Find the union of two lists of integers
 */
public class Question29 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        List<Integer> list2=Arrays.asList(5,6,7,8,9,10);
        List<Integer> finallist = Stream.concat(list.stream(), list2.stream()).toList();
        System.out.println(finallist);
    }
}
