package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * Find the intersection of two lists using Java streams
 */
public class Question35 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = Arrays.asList(3, 5, 6, 7);
        List<Integer> list2 = list.stream().filter(list1::contains).toList();
        System.out.println(list2);
    }
}
