package local;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "anna", "steve", "bob");
        List<String> result = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}
