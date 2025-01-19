package StreamQuestions;

import java.util.Arrays;
import java.util.List;

/**
 *  Remove all non-numeric characters from a list.
 */
public class Question31 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","1a2b3c","123abc");
        List<String> list1 = list
                .stream()
                .map(Question31::removeCharacter)
                .filter(x->x.length()>1).toList();
        System.out.println(list1);
    }
    private static String removeCharacter(String str){
        StringBuilder sb=new StringBuilder();
        char[] chArray=str.toCharArray();
        for(char ch:chArray){
            if(Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
