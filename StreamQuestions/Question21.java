package StreamQuestions;

import java.util.stream.IntStream;

/**
 * Write a program to multiply 1st and last element, 2nd and 2nd last element etc.
 */
public class Question21 {
    public static void main(String[] args) {
        int[] arr={4,5,1,7,2,9};
        IntStream
                .range(0,arr.length/2)
                .map(x->arr[x]*arr[arr.length-x-1])
                .forEach(System.out::println);
    }
}
