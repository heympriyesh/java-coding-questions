package StreamQuestions;

/**
 * 02 Remove duplicates from the string and return in the same order
 * I/P->dabcadefg
 * O/P->dabcefg
 */

public class Question2 {
    public static void main(String[] args) {
        String str="dabcadefg";
        str.chars().distinct().mapToObj(c->(char) c).forEach(System.out::print);
    }
}
