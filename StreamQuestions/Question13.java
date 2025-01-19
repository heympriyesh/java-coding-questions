package StreamQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * Given a string, find the first repeated character
 */
public class Question13 {
    public static void main(String[] args)  {
        String str="Hello World";


        LinkedHashMap<String, Long> charMap = Arrays.stream(str
                        .split(""))
                .collect(Collectors
                        .groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()));
        System.out.println(charMap);
        String s = charMap.entrySet().stream().filter(x -> x.getValue() > 1)
                .map(m -> m.getKey()).findFirst().get();
        System.out.println(s);
    }
}
