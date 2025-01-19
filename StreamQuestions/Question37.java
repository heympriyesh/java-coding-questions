package StreamQuestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Generate the first 10 numbers of the Fibonacci Sequence
 */
public class Question37 {
    public static void main(String[] args) {
        List<Integer> collect = Stream
                .iterate(new int[]{0, 1},
                        f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
