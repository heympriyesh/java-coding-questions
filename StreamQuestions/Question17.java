package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, create a list that contains only integers
 */
public class Question17 {
    public static void main(String[] args) {
        String[] str={"abc","456","123","xyz"};
        List<String> list = Arrays.stream(str).filter(Question17::stringToNumber).toList();
        System.out.println(list);
    }

    private static boolean stringToNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
