package JAVACODE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IsEmptyFind {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Ankit", "Bhaurao", " ","jibhakate");
        System.out.println(stringList.stream().filter(st -> !st.isEmpty()).collect(Collectors.toList()));
    }
}
