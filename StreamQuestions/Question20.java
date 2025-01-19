package StreamQuestions;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Write a stream program to multiply alternative numbers in an array
 */

public class Question20 {
    public static void main(String[] args) {
        int[] arr={4,5,1,7,2,9,2};
        Integer reduce = IntStream
                .range(0, arr.length)
                .filter(x -> x % 2 == 0)
                .map(x -> arr[x])
                .reduce(1,(a, b) -> a * b);
        System.out.println(reduce);
    }
}
