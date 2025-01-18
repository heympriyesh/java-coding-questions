package StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/**
 * Find the 2nd highest length word in the given sentence
 */
public class Question5 {
    public static void main(String[] args) {
        String str="I am learning Streams API in JAVA";
        Integer i = Arrays
                .stream(str.split(" "))
                .map(x -> x.length())
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
        System.out.println(i);
    }
}
