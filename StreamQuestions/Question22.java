package StreamQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a stream program to move all zero’s to beginning of array
 */
public class Question22 {
    public static void main(String[] args) {
        int[] arr={5,0,1,0,8,0};
//        #1
        List<Integer> list = Arrays.stream(arr).boxed().sorted().toList();
        System.out.println(list);
//        #2
        List<Integer> list1 = Arrays
                .stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(x -> x != 0))
                .values()
                .stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(list1);
    }
}
