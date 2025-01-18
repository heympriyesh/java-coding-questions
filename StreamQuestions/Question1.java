package StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 01 Given a sentence, find the word that has the highest length
 */

public class Question1 {
    public static void main(String[] args) {
        String s="I am learning Streams API in JAVA";
        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get());
    }
}
