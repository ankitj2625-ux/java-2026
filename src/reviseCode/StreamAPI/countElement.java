package reviseCode.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class countElement {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple");
        Long countWord = words.stream().count();
        System.out.println(countWord);

    }
}
