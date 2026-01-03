package java_26;


import java.util.Arrays;
import java.util.List;

public class StartsWithLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry");
        words.stream()
                .filter(word -> word.startsWith("A"))
                .forEach(System.out::println);
    }
}
