package StreamQuestions;

import java.util.Arrays;

/**
 * Given a string, find the first non-repeated character
 */
public class Question12 {
    public static void main(String[] args) {
        String str="Hello world";
        System.out.println(Arrays
                .stream(str.split(""))
                .filter(s->s.indexOf(s)==s.lastIndexOf(s))
                .findFirst().get());


    }
}
