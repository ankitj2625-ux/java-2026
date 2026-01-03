package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddPrefix {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        List<String> prefix = numbers.stream()
                .map(addPref -> "ankit : " + addPref)
                .collect(Collectors.toList());

        System.out.println(prefix);


        //*****************************************************************//

        List<String> suffix = numbers.stream()
                .map(addPref ->  addPref + " = ankit jibhakate ")
                .collect(Collectors.toList());
        System.out.println(suffix);

    }
}
