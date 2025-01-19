package StreamQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Print the middle character of a given String
 */
public class Question41 {
//
    public static void main(String[] args) {
        String str="middle";
        int len= str.length();
        int mid=len/2;
        String collect = IntStream.range(0, len)
                .filter(i -> (len % 2 == 0 && (i == mid - 1 || i == mid)) ||
                        (len % 2 != 0 && i == mid)
                ).mapToObj(str::charAt)
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
