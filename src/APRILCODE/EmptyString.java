package APRILCODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "def", "", "ghi");
        List<String> stringList = strings.stream().filter(st -> !st.isEmpty()).collect(Collectors.toList());
        System.out.println(stringList);
    }
}
