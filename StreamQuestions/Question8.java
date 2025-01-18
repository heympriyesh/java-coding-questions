package StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Divide given integer list into lists of even and odd numbers
 * I/P={1,2,3,4,5,6,7,8}
 * O/P=[[1,3,5,7],[2,4,6,8]]
 */
public class Question8 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toList());
        collect.add(10);
        collect
                .stream()
                        .collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()))
                                .entrySet()
                .stream()
                .map(x->x.getValue())
                        .collect(Collectors.toList());
        System.out.println(collect);
    }
}
