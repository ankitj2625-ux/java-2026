package BB;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveWordInString {
    public static void main(String[] args) {
        String s = "ankit , mohan, deepak, vishal";

        String str = Arrays.stream(s.split(","))
                .map(String::trim)
                .filter(remo -> !remo.equals("ankit"))
                .collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
