package StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;

/**
 *  Find the word that has the second-highest (N) length
 */
public class Question4 {
    public static void main(String[] args) {
        String str="I am learning Streams API in JAVA";
        String s = Arrays.stream(str.split(" "))
                .sorted(
                        Comparator.comparing(String::length).reversed())
                .skip(1).findFirst().get();
        System.out.println(s);
    }
}
