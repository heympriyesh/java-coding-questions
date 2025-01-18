package StreamQuestions;

import java.util.Arrays;

/**
 * Given an array, find the sum of unique elements
 */
public class Question11 {
    public static void main(String[] args) {
        int[] arr={1,6,7,8,1,1,8,8,7};
        Integer i = Arrays
                .stream(arr)
                .mapToObj(x -> x)
                .distinct()
                .reduce((x,y)->x+y).get();
        System.out.println("Sum method -> one "+Arrays.stream(arr).distinct().sum());
        System.out.println("Sum method -> two "+i);
     }
}
