package StreamQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given the string[] group the strings based on the middle character
 */
public class Question24 {
    public static void main(String[] args) {
        String[] str={"ewe","jji","jhj","kwk","aha"};
        Map<String, List<String>> sortedList=Arrays
                .stream(str)
                .collect(Collectors.groupingBy(x->{
            return String.valueOf(x.charAt(x.length()/2));
        }));
    }
}
