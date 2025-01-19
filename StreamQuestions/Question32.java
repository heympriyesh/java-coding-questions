package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * Find and print strings containing only digits.
 */
public class Question32 {
    public static void main(String[] args) {
        List<String> abc = Arrays.asList("123", "abc", "123abc", "45");
        List<String> list = abc.stream().filter(Question32::containsOnlyNumber).toList();
        System.out.println(list);
    }
    private static boolean containsOnlyNumber(String str){
        char[] ch=str.toCharArray();
        for (char c:ch){
            if(Character.isAlphabetic(c)){
                return false;
            }
        }
        return true;
    }
}
