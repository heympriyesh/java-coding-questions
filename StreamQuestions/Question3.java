package StreamQuestions;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Generate random strings for an IntStream
 */
public class Question3 {
    public static void main(String[] args) {
        Random random=new Random();
        String collect = IntStream.range(1, 6)
                .mapToObj(i -> {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < i; j++) {
                        sb.append((char) (random.nextInt(26) + 'a'));
                    }
                    return sb;
                })
                .collect(Collectors.joining(","));
        System.out.println(collect );
    }
}
