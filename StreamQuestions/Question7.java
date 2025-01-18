package StreamQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Given a sentence, find the words with a specified number of vowels
 * No of vowels: 2
 */
public class Question7 {
    public static void main(String[] args) {
        String str="I am learning Streams API in Java Java";
        int vowelCount = 2;
        String newString=Arrays.stream(str.split(" "))
                .filter(word-> wordCount(word)==vowelCount)
                .collect(Collectors.joining(","));
        System.out.println(newString);
    }

    private static int wordCount(String word){
        return (int) word.chars()
                .filter(ch->"aeiou".indexOf(ch)!=-1)
                .count();
    }
}
