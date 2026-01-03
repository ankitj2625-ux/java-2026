package functionalInterface;

import java.util.function.BiFunction;

public class BiFunction2 {
    public static void main(String[] args) {

        BiFunction<String, String, String> bifun = (str1, str2) -> str1.toUpperCase() + " : " + str2.toUpperCase();

        String result = bifun.apply("ankit", "jibhakate");
        System.out.println(result);

        BiFunction<String, String, String> bifu = (s1, s2) -> s1.length() > s2.length() ? s1 : s2;

        String output = bifu.apply("ankit", "jibhakate");

        System.out.println(output);


    }
}
