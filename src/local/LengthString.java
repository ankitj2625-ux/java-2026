package local;

import java.util.List;

public class LengthString {
    public static void main(String[] args) {
        List<String> names = List.of("Zoe", "Adam", "Bob");
        names.stream().forEach(System.out::println);
    }
}
