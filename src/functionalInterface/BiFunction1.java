package functionalInterface;

import java.util.function.BiFunction;

public class BiFunction1 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> val = (a, b) -> a + b;

        int result = val.apply(5, 9);
        System.out.println(result);


        BiFunction<String, String, String> map = (str1, str2) -> str1 + " " + str2;

        String concats = map.apply("ankit", "jibhakate");
        System.out.println(concats);
    }
}
