package StreamQuestions;

import java.util.Arrays;

/**
 * 02 Remove duplicates from the string and return in the same order
 * I/P->dabcadefg
 * O/P->dabcefg
 */

public class Question2 {
    public static void main(String[] args) {
        String str="dabcadefg";
        str.chars().distinct().mapToObj(c->(char) c).forEach(System.out::print);
//        Solution 2
        System.out.println("\n---------");
        Arrays.stream(str.split("")).distinct().forEach(System.out::print);
    }
}
