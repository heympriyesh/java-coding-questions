package StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Calculate the average of all the numbers.
 */
public class Question34 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        double asDouble = list.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println(asDouble);
    }
}
